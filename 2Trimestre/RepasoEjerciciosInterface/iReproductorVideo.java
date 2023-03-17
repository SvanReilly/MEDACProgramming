package RepasoEjerciciosInterface;

/*
 P1.  a)  Defina  la  interfaz  IReproductorVideo.  Dicha  interfaz  tendrá  el  mismo  contenido  que 
IReproductorPortatil  e  incluirá  la  definición  de  los  métodos  consultores  y  modificadores  para 
acceder a los siguientes atributos: 
 
• reproduceWMV, reproduceDIVX, reproduceMPG, reproduceDVD, reproduceJPG: 
Atributos de tipo booleano que indican si el reproductor es capaz de mostrar los formatos 
WMV, DIVX, MPG, DVD y JPG. 
• tamanyoDeLaPantalla:  Atributo  decimal  que  indicará  el  tamaño  de  la  pantalla  del 
dispositivo expresada en pulgadas. 
• television: Atributo booleano que indica si el dispositivo es capaz de sintonizar emisoras 
de televisión. 
 
b)  Cree  la  clase  ReproductorVideo  cuyos  objetos  representarán  a  reproductores  de  video 
portátiles. La presente clase deberá extender a la clase ReproductorPortatil e implementará la 
interfaz  IReproductorVideo.  Esta  clase  dispondrá  de  los  atributos  privados  necesarios  para 
implementar la citada interfaz. 
 
Finalmente, la clase deberá disponer de un método constructor que permitirá inicializar la marca, 
el modelo y el tamaño de la pantalla del reproductor de vídeo. 
 
c) Cree un programa principal que muestre el funcionamiento de la clase. 
 */

public interface iReproductorVideo extends iReproductorPortatil{
	

	public boolean isReproduceWMV();
    public void setReproduceWMV(boolean reproduceWMV);
    
    public boolean isReproduceDIVX();
    public void setReproduceDIVX(boolean reproduceDIVX);
    
    public boolean isReproduceMPG();
    public void setReproduceMPG(boolean reproduceMPG);

	public boolean isReproduceDVD();
    public void setReproduceDVD(boolean reproduceDVD);
    
    public boolean isReproduceJPG();
    public void setReproduceJPG(boolean reproduceJPG);
    
    public float getTamañoDeLaPantalla();
    public void setTamañoDeLaPantalla(float tamañoDeLaPantalla);
    
    public boolean isTelevision();
    public void setTelevision(boolean television);
}
