import java.time.LocalDate;

import br.com.dio.desafio.dominio.*;


public class Main {
	
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		
		curso1.setTitulo(" curso java");
		curso1.setDescricao(" descrição curso java ");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		
		curso2.setTitulo(" curso javascript");
		curso2.setDescricao(" descrição curso javascript ");
		curso2.setCargaHoraria(4);
		

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de java");
		mentoria.setDescricao("descrição mentoria de java");
		mentoria.setData(LocalDate.now());
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp GFT Quality Assurance #1");
		bootcamp.setDescricao("Descrição Bootcamp GFT Quality Assurance #1");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devLays = new Dev();
		devLays.setNome("Lays Maiara A. Alves");
		devLays.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos, Lays:" + devLays.getConteudosInscritos());
		devLays.progredir();
		devLays.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos, Lays:" + devLays.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos, Lays:" + devLays.getConteudosConcluidos());
		System.out.println("XP:" + devLays.calcularTotalXp());

		System.out.println("--------------");
		
		Dev devAda = new Dev();
		devAda.setNome("Ada Lovelace");
		devAda.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos, Ada:" + devAda.getConteudosInscritos());
		devAda.progredir();
		devAda.progredir();
		devAda.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos, Ada:" + devAda.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos, Ada:" + devAda.getConteudosConcluidos());
		System.out.println("XP:" + devAda.calcularTotalXp());


	}
	
}
