import java.awt.Color;
public class Editor4 {
   public static void main(String[] args) {
      String name = args[0];
      int n = Integer.parseInt(args[1]);
      Color[][] source = Runigram.read(name);
      Color[][] target = Runigram.grayScaled(source);
      Runigram.setCanvas(source);
      Runigram.morph(source, target, n);
   }  
}





