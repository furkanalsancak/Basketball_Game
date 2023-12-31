package game;

import city.cs.engine.*;
import city.cs.engine.Shape;
import org.jbox2d.common.Vec2;

import java.awt.*;

public class GameWorld extends World {

    private Student student;

    public GameWorld(){
        // make the ground
        Shape shape = new BoxShape(11, 0.5f);
        StaticBody ground = new StaticBody(this, shape);
        ground.setPosition(new Vec2(0, -11.5f));


        // make a platform
        Shape platform1Shape = new BoxShape(4, 0.5f);
        StaticBody platform1 = new StaticBody(this, platform1Shape);
        platform1.setPosition(new Vec2(-9, 5.5f));
        platform1.setFillColor(Color.RED);

        // add another platform here
        Shape platform2Shape = new BoxShape(4, 0.5f);
        StaticBody platform2 = new StaticBody(this, platform2Shape);
        platform2.setPosition(new Vec2(9f, 5.5f));
        platform2.setAngleDegrees(25);

        //walls
        Shape wall1Shape = new BoxShape(0.5f, 6f);
        StaticBody wall1 = new StaticBody(this, wall1Shape);
        wall1.setPosition(new Vec2(-11.5f, -6f));

        //boxes
//        for (int i=0; i<=10; i++){
//            Shape boxShape = new BoxShape(0.5f, 0.3f);
//            DynamicBody box = new DynamicBody(world, boxShape);
//            box.setPosition(new Vec2(5, -11+i));
//            box.setFillColor(Color.magenta);
//        }

        //long boxes
        for (int i=0;i<5;i++){
            Shape boxShape = new BoxShape(0.5f, 3f);
            DynamicBody longBox = new DynamicBody(this, boxShape);
            longBox.setPosition(new Vec2(-8+i*3f, -10f));
            if (longBox.getPosition().x==-8){
                longBox.setAngleDegrees(-5);
            }
        }



        // make a character
        student = new Student(this);
        student.setPosition(new Vec2(8, -10));
        Student student2 = new Student(this);
        student2.setPosition(new Vec2(6, -10));

//        Shape studentShape = new PolygonShape(
//                -0.11f,1.8f,
//                         0.87f,1.48f,
//                         0.99f,0.29f,
//                         0.24f,-2.32f,
//                         -1.12f,-2.27f,
//                         -1.24f,1.21f);
//        DynamicBody student = new DynamicBody(world, studentShape);
//        student.addImage(new BodyImage("data/student.png", 5f));
//        student.setPosition(new Vec2(8, -10));
        //student.setLinearVelocity(new Vec2(0,10));
        //student.setAngularVelocity(10);

        //professor
//        Shape professorShape = new PolygonShape(
//                -1.98f,1.8f, 0.39f,2.5f, 1.3f,2.29f, 2.02f,-0.29f, 1.54f,-2.38f, -0.36f,-2.39f, -1.95f,1.44f);
//        DynamicBody professor = new DynamicBody(world, professorShape);
//        professor.addImage(new BodyImage("data/professor.png", 5f));
//        professor.setPosition(new Vec2(-5, -10));
//        professor.setAlwaysOutline(true);
    }

    public Student getStudent(){return student;}

}
