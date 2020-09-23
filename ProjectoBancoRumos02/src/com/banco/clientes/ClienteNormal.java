package com.banco.clientes;

import com.banco.cartoes.CartaoBancario;
import static com.banco.clientes.Cliente.contadorClientes;
import com.banco.contas.Conta;
import com.banco.output.Menu;
import java.util.ArrayList;
import java.util.List;

public class ClienteNormal extends Cliente {

    public ClienteNormal(int numCliente, long numCidadao, String nome, String morada, String profissao, String telefone, String email, int numAgencia, List<Conta> contas, List<CartaoBancario> cartoes) {
        super(numCliente, numCidadao, nome, morada, profissao, telefone, email, numAgencia, contas, cartoes);
    }

}
