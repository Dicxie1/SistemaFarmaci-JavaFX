package view.img;

import java.io.InputStream;
import java.net.URL;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Img {
	public static InputStream getImagen(String string) {return Img.class.getResourceAsStream(string);}
	
	public static ImageView getButtonGraphic(String string) {
		Image imgen = new Image(Img.getImagen(string));
		ImageView imageView = new ImageView(imgen);
		imageView.setFitHeight(20);
		imageView.setFitWidth(20);
		return imageView;
	}
}
