package se.ffcg.bank.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import se.ffcg.bank.ejb.CustomerBean;
import se.ffcg.bank.entities.Customer;


@Controller
public class CustomerController {

        String message = "Welcome to Spring MVC!";
         
        @RequestMapping("/hello")
        public ModelAndView showMessage(
                        @RequestParam(value="id", required = false, defaultValue = "World") int id) {
//test
                Customer customer = new CustomerBean().getCustomer(id);
                
                ModelAndView mv = new ModelAndView("Welcome");
                mv.addObject("message", message);
                mv.addObject("name", customer.getFirstName() + "" + customer.getLastName());
                return mv;
        }

//      @RequestMapping("/login")       
//      public @ResponseBody String login(@RequestParam int customerId, @RequestParam String password){
//              Customer customer = new CustomerManager().getCustomer(customerId);
//              return "Welcome " + customer.getFirstName();
//      }

}
