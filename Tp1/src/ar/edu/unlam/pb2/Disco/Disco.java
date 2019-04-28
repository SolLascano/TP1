package ar.edu.unlam.pb2.Disco;

public class Disco {
	
	private Double radioInterior;
	private Double radioExterior;
	private Double perimetroInterior;
	private Double perimetroExterior;
	private Double superficie;
	
	
	public Disco(Double radioExterior, Double radioInterior ) {
		this.radioExterior=radioExterior;
		this.radioInterior=radioInterior;
	}
	

	public Double getRadioInterior() {
		return radioInterior;
	}

	public void setRadioInterior(Double radioInterior) {
		this.radioInterior = radioInterior;
	}


	public Double getRadioExterior() {
		return radioExterior;
	}

	public void setRadioExterior(Double radioExterior) {
		this.radioExterior = radioExterior;
	}

	public Double calcularPerimetroInteriorDisco (Double radioInterior) {
		perimetroInterior= 2*(Math.PI)*radioInterior;
		return perimetroInterior;
	}
	
	public Double calcularPerimetroExteriorDisco (Double radioExterior) {
			perimetroExterior=2*(Math.PI)*radioExterior;
			return perimetroExterior;
		}
	
	public Double calcularSuperficieDisco () {
		superficie= (Math.PI)*((radioExterior*radioExterior)-(radioInterior*radioInterior));
		return superficie;
	}

}

 