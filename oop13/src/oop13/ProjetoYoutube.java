package oop13;

public class ProjetoYoutube {

	public static void main(String[] args) {
		Video[] v = new Video[3];
		v[0] = new Video("Aula 1 de POO");
		v[1] = new Video("Aula 12 de PHP");
		v[2] = new Video("Aula 2 de HTML");

		Gafanhoto[] g = new Gafanhoto[2];
		
		g[0]= new Gafanhoto("Jubileu", 22, "M", "juba");
		g[1]= new Gafanhoto("Creuza", 12, "F", "creuzita");
		
		Visualizacao[] vis = new Visualizacao[2];
		
		vis[0]= new Visualizacao(g[0],v[0]);	
		vis[0].avaliar();
		vis[0]= new Visualizacao(g[0],v[1]);	
		vis[0].avaliar(6);
		
		
		System.out.println(vis[0].toString());
	//	System.out.println(v[1].toString());
	//	System.out.println(v[2].toString());
	}

}
