package controllers;

import models.Car;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Results;

import java.util.ArrayList;
import java.util.List;

public class IndexController extends Controller {

    public Result index(){
        List<Car> cars=new ArrayList<Car>();
        cars=Car.find.all();
        return ok(views.html.index.render());
    }

    public Result show(String title){
        return ok(views.html.show.render(title));
    }

    public Result about() {
        return ok(views.html.about.render());
    }

}
