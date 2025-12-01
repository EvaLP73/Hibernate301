package org.example.repositorio;

import org.hibernate.Session;
import org.hibernate.Transaction;

import org.example.entidades.Dpto;

public class DptoRepositorio implements Repositorio<Dpto>{

    private Session session;

    public DptoRepositorio(Session session) {
        super();
        this.session = session;
    }

    @Override
    public void guardar(Dpto t) {
        Transaction trx = this.session.beginTransaction();
        session.persist(t);
        trx.commit();
    }
}
