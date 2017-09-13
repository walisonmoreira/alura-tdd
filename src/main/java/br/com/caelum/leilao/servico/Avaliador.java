package br.com.caelum.leilao.servico;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;

public class Avaliador {

  private double maiorDeTodos = Double.NEGATIVE_INFINITY;

  public double getMaiorLance() {
    return maiorDeTodos;
  }

  public void avalia(Leilao leilao) {
    for (Lance lance : leilao.getLances()) {
      if (lance.getValor() > maiorDeTodos)
        maiorDeTodos = lance.getValor();
    }
  }

}
