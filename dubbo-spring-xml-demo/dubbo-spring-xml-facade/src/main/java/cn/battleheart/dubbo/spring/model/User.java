package cn.battleheart.dubbo.spring.model;

import lombok.Data;

import java.io.Serializable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * 用户类。
 *
 * @author battleheart
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = -8990540016300146947L;
    private Long id;

    @NotNull
    @Pattern(regexp = "^\\s*\\w+(?:\\.{0,1}[\\w-]+)*@[a-zA-Z0-9]+(?:[-.][a-zA-Z0-9]+)*\\.[a-zA-Z]+\\s*$")
    private String name;

    @NotNull
    @Pattern(regexp = "^\\s*\\w+(?:\\.{0,1}[\\w-]+)*@[a-zA-Z0-9]+(?:[-.][a-zA-Z0-9]+)*\\.[a-zA-Z]+\\s*$")
    private String password;
}
