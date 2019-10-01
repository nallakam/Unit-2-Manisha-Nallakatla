import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Polygon;

public class ManishaDrawing extends Application {

  public void start(Stage stage){

    Circle face = new Circle(150, 60, 50);

      face.setStroke(Color.YELLOW);
      face.setFill(Color.YELLOW);

    Circle leftEye = new Circle(130, 45, 5);

      leftEye.setStroke(Color.BLACK);
      leftEye.setFill(Color.BLACK);

    Circle rightEye = new Circle(170, 45, 5);

      rightEye.setStroke(Color.BLACK);
      rightEye.setFill(Color.BLACK);

    Arc smile = new Arc();

      smile.setCenterX(150.0f);
      smile.setCenterY(65.0f);
      smile.setRadiusX(20.0f);
      smile.setRadiusY(20.0f);
      smile.setStartAngle(210.0f);
      smile.setLength(120.0f);
      smile.setStroke(Color.BLACK);

    Polygon bowtie = new Polygon();
    bowtie.getPoints().addAll(new Double[] {
      140.0, 100.0,
      140.0, 110.0,
      160.0, 100.0,
      160.0, 110.0
    });

    bowtie.setStroke(Color.PURPLE);
    bowtie.setFill(Color.PURPLE);

    Polygon bowtieCenter = new Polygon();
    bowtieCenter.getPoints().addAll(new Double[] {
      148.0, 102.0,
      148.0, 108.0,
      152.0, 108.0,
      152.0, 102.0
    });

    bowtieCenter.setStroke(Color.PURPLE);
    bowtieCenter.setFill(Color.PURPLE);

    Group root = new Group(face, leftEye, rightEye, smile, bowtie, bowtieCenter);
    Scene scene = new Scene(root, 300, 120, Color.PINK);

    stage.setTitle("ManishaDrawing");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args){
    launch(args);
  }
}
