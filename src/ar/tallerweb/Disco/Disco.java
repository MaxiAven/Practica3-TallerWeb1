package ar.tallerweb.Disco;

public class Disco {
	float radioInt;
	
	float radioExt;
	
	public Disco(float radioInt,float radioExt){
		this.radioInt=radioInt;
		this.radioExt=radioExt;
	}
	
	public double calcularPerimetroInterior(){
		double perimetroInt=3.14*(2*this.radioInt);
		
		return perimetroInt;
	}

	
	public double calcularPerimetroExterior(){
		
		double perimetroExt=3.14*(2*this.radioExt);
		
		return perimetroExt;
	}
	
	public double calcularAreaChica(){
		
		double areaChica=3.14*this.radioInt*this.radioInt;
		return areaChica;
		
	}
	
	public double calcularAreaGrande(){
		
		double areaGrande=3.14*this.radioExt*this.radioExt;
		
		return areaGrande;
		
	}
	
	public double calcularArea(){
		
		double area=this.calcularAreaGrande()-this.calcularAreaChica();
		
		return area;
	}
	
}

