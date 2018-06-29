package boot2018.demo.dto;

import java.io.Serializable;

public class UserDTO implements Serializable {

    //姓名
    private String usernmae;

    //学号
    private int studentId;


    public String getUsernmae() {
        return usernmae;
    }

    public void setUsernmae(String usernmae) {
        this.usernmae = usernmae;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
