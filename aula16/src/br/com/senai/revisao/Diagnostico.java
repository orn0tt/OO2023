package br.com.senai.revisao;

import java.util.List;

public interface Diagnostico {

	List<String> realizarExame(String nome);

	List<String> receituario(List<String> remedios);
}