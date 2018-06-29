package boot2018.demo.controller;

import boot2018.demo.dto.UserDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")
public class ResourceController {

    @RequestMapping(value = "/get",method = {RequestMethod.GET,RequestMethod.POST})
    public UserDTO execute() {
        UserDTO userDTO = new UserDTO();
        //编号
        userDTO.setStudentId(11);
        //姓名
        userDTO.setUsernmae("zhangmin");
        return userDTO;
    }


}
