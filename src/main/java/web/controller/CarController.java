package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {


    List<Car> carList = new ArrayList<>();

    @GetMapping(value = "/cars")
    public String welcome(@RequestParam("quantityCar") int quantityCar, Model model) {
        model.addAttribute("message", quantityCar);
        return "cars";
    }

    public List<Car> getCarList() {
        carList.add(new Car("zaz","white",1));
        carList.add(new Car("vaz","black",2));
        carList.add(new Car("gaz","red",3));
        carList.add(new Car("izh","blue",4));
        carList.add(new Car("fiat","grey",5));
        return carList;
    }


}
