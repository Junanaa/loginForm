package daelim.spring_ch10;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

public class RegisterRequest {

    @Email
    @NotBlank
    private String email;
    @Size(min = 6)
    private String password;
    @NotEmpty
    private String passwordConfirm;
    @NotEmpty
    private String name;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return passwordConfirm;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.passwordConfirm = confirmPassword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPasswordEqualToConfirmPassword() {
        return password.equals(passwordConfirm);
    }
}
