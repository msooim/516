package untitled.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import untitled.domain.*;

@RestController
// @RequestMapping(value="/employees")
@Transactional
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @PutMapping("/employees/search/findByUserId")
    public Object findByUserId(@RequestBody EmployeeVIewQuery query) {
        return employeeRepository.findByUserId(query.getUserId());
    }
}
