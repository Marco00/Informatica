/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilaiterabilemodellomvc;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author marco.pistollato
 */
public class FrameContatore extends Frame implements ActionListener {

    PilaConNodo<String> pila = new PilaConNodo();
    Iteratore it = new Iteratore(pila);
    TextField hello;
    Button push, pop, top, isEmpty, back, corrente, ahead;

    public FrameContatore(String titolo) {
        super(titolo);

        pila = new PilaConNodo<>();
        hello = new TextField();
        push = new Button("push");
        pop = new Button("pop");
        top = new Button(pila.top() == null ? "" : "Top: "+pila.top().val);
        isEmpty = new Button(pila.isEmpty() == true ? "isEmpty" : "");
        back = new Button("<<");
        corrente = new Button("Elem corrente: " + String.valueOf(it.current()));
        ahead = new Button(">");

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        }
        );

        setSize(900, 400);
        setLayout(new GridLayout(3, 3, 2, 4));
        add(hello);
        add(push);
        add(pop);
        add(top);
        add(isEmpty);
        add(back);
        add(corrente);
        add(ahead);
        hello.addActionListener(this);
        push.addActionListener(this);
        pop.addActionListener(this);
        top.addActionListener(this);
        isEmpty.addActionListener(this);
        back.addActionListener(this);
        corrente.addActionListener(this);
        ahead.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == push) {
            String parola = hello.getText();
            pila.push(parola);
            it = new Iteratore(pila);
            isEmpty.setLabel(pila.isEmpty() == true ? "isEmpty" : "");
            if(pila.top().val == null)
                top.setLabel("Top: null");
            else
                top.setLabel("Top: "+String.valueOf(pila.top().val));
            corrente.setLabel("Elem corrente: " + it.current());
            System.out.println("Premuto bottone push");
            hello.setText("");
        }
        if (e.getSource() == pop) {
            pila.pop();
            isEmpty.setLabel(pila.isEmpty() == true ? "isEmpty" : "");
            if(pila.top().val == null)
                top.setLabel("Top: null");
            else
                top.setLabel("Top: "+String.valueOf(pila.top().val));
            corrente.setLabel("Elem corrente: " + it.current());
            System.out.println("Premuto bottone pop");
        }
        if (e.getSource() == back) {
            it.goFirst();
            corrente.setLabel("Elem corrente: " + it.current());
            System.out.println("Premuto bottone <<");
        }
        if (e.getSource() == ahead) {
            it.goNext();
            corrente.setLabel("Elem corrente: " + it.current());
            System.out.println("Premuto bottone >");
        }
    }
}
