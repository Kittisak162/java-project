package controllers;

import models.Car;
import play.Logger;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Results;

import java.util.ArrayList;
import java.util.List;

public class IndexController extends Controller {
    int s,l,h;
    List<Car> cars=Car.find.all();
    List<Car> car=new ArrayList<>();

    public Result index(){
        return ok(views.html.index.render());
    }

    public Result tempshow(String title,int s,int l,int h){
        this.s=s;
        this.l=l;
        this.h=h;
        return Results.redirect(routes.IndexController.show(title));
    }

    public Result show(String title){
        Logger.warn(""+s+" "+title);
        if(s==0){
            getSelect0(title);
        }else if(s==1){
            getSelect1(title);
        }else if(s==2){
            getSelect2(title);
        }
        return ok(views.html.show.render(title,car,this.s));
    }

    public Result about() {
        List<Car> cars=Car.find.all();
        return ok(views.html.about.render(cars));
    }

    public void check(){
        if(l!=-1 && h==-1){
            for (int i = 0; i <cars.size() ; i++) {
                if(cars.get(i).price>=l){
                    car.add(car.get(i));
                }
            }
        }else if(l==-1 && h!=-1){
            for (int i = 0; i <cars.size() ; i++) {
                if(cars.get(i).price<=h){
                    car.add(car.get(i));
                }
            }
        }else if(l!=-1 && h!=-1){
            for (int i = 0; i <cars.size() ; i++) {
                if(cars.get(i).price>=l && car.get(i).price<=h){
                    car.add(car.get(i));
                }
            }
        }
    }

    public void getSelect0(String title){
	car=new ArrayList<>();
	for (int i =0; i <cars.size() ; i++){
		if(cars.get(i).brandth.equals(title)){
			car.add(cars.get(i));
		}
	}
        check();
        for (int i = 0; i <car.size()-1 ; i++) {
            for (int j = i+1; j <car.size() ; j++) {
                if(car.get(i).vote<=car.get(j).vote){
                    List<Car> temp=new ArrayList<>();
                    temp.add(car.get(i));
                    car.set(i,car.get(j));
                    car.set(j,temp.get(0));
                }
            }
        }
    }

    public void getSelect1(String title){
        car=new ArrayList<>();
        for (int i =0; i <cars.size() ; i++){
            if(cars.get(i).brandth.equals(title)){
                car.add(cars.get(i));
            }
        }
        check();
        for (int i = 0; i <car.size()-1 ; i++) {
            for (int j = i+1; j <car.size() ; j++) {
                if(car.get(i).price>=car.get(j).price){
                    List<Car> temp=new ArrayList<>();
                    temp.add(car.get(i));
                    car.set(i,car.get(j));
                    car.set(j,temp.get(0));
                }
            }
        }
    }

    public void getSelect2(String title){
        car=new ArrayList<>();
        for (int i =0; i <cars.size() ; i++){
            if(cars.get(i).brandth.equals(title)){
                car.add(cars.get(i));
            }
        }
        check();
        for (int i = 0; i <car.size()-1 ; i++) {
            for (int j = i+1; j <car.size() ; j++) {
                if(car.get(i).price<=car.get(j).price){
                    List<Car> temp=new ArrayList<>();
                    temp.add(car.get(i));
                    car.set(i,car.get(j));
                    car.set(j,temp.get(0));
                }
            }
        }
    }

}
