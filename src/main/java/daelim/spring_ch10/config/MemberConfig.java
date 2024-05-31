package daelim.spring_ch10.config;

import daelim.spring_ch10.service.ChangePasswordService;
import daelim.spring_ch10.MemberDao;
import daelim.spring_ch10.service.MemberRegisterService;
import daelim.spring_ch10.service.AuthService;
import daelim.spring_ch10.service.MemberService;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class MemberConfig {

    @Bean(destroyMethod = "close")
    public DataSource dataSource() {
        DataSource ds = new DataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://daelim-spring.cxouguwyws0x.ap-northeast-2.rds.amazonaws.com/daelim?characterEncoding=utf8");
        ds.setUsername("admin");
        ds.setPassword("daelimspring");
        ds.setInitialSize(2);
        ds.setMaxActive(10);
        return ds;
    }

    @Bean
    public PlatformTransactionManager transactionManager() {
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource());
        return dataSourceTransactionManager;
    }

    @Bean
    public MemberDao memberDao() {
        return new MemberDao(dataSource());
    }

    @Bean
    public MemberRegisterService memberRegisterService() {
        return new MemberRegisterService(memberDao());
    }

    @Bean
    public ChangePasswordService changePasswordService() {
        return new ChangePasswordService();
    }

    @Bean
    public AuthService authService() {
        return new AuthService();
    }

    @Bean
    public MemberService memberService(){return  new MemberService();}
}
