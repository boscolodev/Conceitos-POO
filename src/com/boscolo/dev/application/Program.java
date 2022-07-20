package com.boscolo.dev.application;

import java.time.LocalDate;

import com.boscolo.dev.Entities.Bootcamp;
import com.boscolo.dev.Entities.Curso;
import com.boscolo.dev.Entities.Developer;
import com.boscolo.dev.Entities.Mentoria;

public class Program {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso de Java");
		curso1.setDescricao("Abstraindo conceitos java.");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso de JavaScript");
		curso2.setDescricao("Abstraindo conceitos javascript");
		curso2.setCargaHoraria(12);
	
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria Java");
		mentoria1.setDescricao("Descrição  Mentoria Java");
		mentoria1.setData(LocalDate.now());
				
		Bootcamp bootcamp1 = new Bootcamp();
		bootcamp1.setNome("Bootcamp Java Developer");
		bootcamp1.setDescricao("Descrição BootCamp Java Developer");
		bootcamp1.getConteudos().add(curso1);
		bootcamp1.getConteudos().add(curso2);
		bootcamp1.getConteudos().add(mentoria1);
		
		Developer dev1 = new Developer();
		dev1.setNome("Guilherme");
		dev1.inscreveBootcamp(bootcamp1);
		System.out.println("Conteúdos Incritos: "+dev1.getConteudosInscritos());
		dev1.progredir();
		System.out.println("Conteúdos Incritos Pós Progressão: "+dev1.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos: "+dev1.getConteudosConcluidos());
		System.out.println("Experiência: "+dev1.calcularProgressao());
		
		Developer dev2 = new Developer();
		dev2.setNome("Hevelyn");
		dev2.inscreveBootcamp(bootcamp1);
		System.out.println("\nConteúdos Incritos: "+dev2.getConteudosInscritos());
		dev2.progredir();
		dev2.progredir();
		dev2.progredir();
		dev2.progredir();

		System.out.println("Conteúdos Incritos Pós Progressão: "+dev2.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos: "+dev2.getConteudosConcluidos());
		System.out.println("Experiência: "+dev2.calcularProgressao());
		
		
		
	}
	
}
