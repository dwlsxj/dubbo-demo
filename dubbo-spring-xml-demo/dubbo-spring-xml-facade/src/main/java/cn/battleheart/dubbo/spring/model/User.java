package cn.battleheart.dubbo.spring.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户类。
 *
 * @author battleheart
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = -8990540016300146947L;
    private Long id;
    private String name;
    private String password;
}
