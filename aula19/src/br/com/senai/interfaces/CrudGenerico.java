package br.com.senai.interfaces;

import java.util.List;

public interface CrudGenerico<T> {

	public List<T> listar();

	public List<T> listarPorNome(String nome, int tipoBusca);

	public T buscar(int codigo);

	public void inserir(T t);

	public void atualizar(T t);

	public void remover(int codigo);
}