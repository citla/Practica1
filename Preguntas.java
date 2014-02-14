import java.awt.*; 
public class Preguntas { 

Frame f; 
Choice c,h,t,q,s,k,n,x;
Label e,l,w,d,y,e1,l1,w1,lb1, lb2, lb3, lb4, lb5;
Panel p,p2,p3; 
Button b1,b2; 

public Preguntas() {

f=new Frame("Preguntas"); 
b1=new Button("Siguiente"); 
b2=new Button("Salir");
f.setLayout(new FlowLayout()); 
f.add(b1); 
f.add(b2);

c=new Choice();
h=new Choice();
t=new Choice(); 
q=new Choice();
s=new Choice();
k=new Choice();
n=new Choice();
x=new Choice();
 
c.add("1 a 2"); 
c.add("2 a 3");
c.add("Mas de 4");
c.add("Ninguno");


h.add("Romance"); 
h.add("Ación"); 
h.add("Aventura");
h.add("Suspenso, Terror");
h.add("Comedia");
h.add("Otro");

t.add("Si"); 
t.add("No"); 

q.add("Si");
q.add("No"); 

s.add("Ninguno"); 
s.add("5"); 
s.add("10"); 
s.add("15"); 
s.add("Mas de 20"); 

k.add("De toda");
k.add("Rokc");
k.add("Metal");
k.add("Pop");
k.add("Banda");
k.add("Corridos");
k.add("Clasicos");
k.add("Otas");

n.add("Rojo");
n.add("Verde");
n.add("Negro");
n.add("Rosa");
n.add("Amarillo");
n.add("Azul");
n.add("Blaco");
n.add("Cafe");
n.add("Morado");
n.add("Otro");
n.add("Naranja");
n.add("Gris");
n.add("Ninguno");
n.add("Todos");

x.add("Gato");
x.add("Perro");
x.add("Aracnidos(Arañas)");
x.add("Reptiles(Serpientes, Cocodrilos)");
x.add("Acuaticos(Peces)");
x.add("Todos");
x.add("Ninguno");

e=new Label ("¿Cuantos libros lees al mes?"); 
l=new Label ("¿Que tipo de genero te gusta mas?");
w=new Label("¿Escribes en tu tiempo libre?");
d=new Label ("¿Te gusta asistir a eventos literarios?"); 
y=new Label ("¿Cuantos libros tienes en casa?");
e1=new Label ("¿Que tipo de musica te gusta mas?");
l1=new Label ("¿Cual es tu color favorito?");
w1=new Label ("¿Que animal te gusta mas?");

f.setLayout(new GridLayout(10,10,10,10)); 
f.setSize(250,400); 
f.add(e);
f.add(c); 
f.add(c); 
f.add(l); 
f.add(h); 
f.add(h);
  f.add(w);
  f.add(t);
  f.add(t); 
  f.add(d); 
  f.add(q);
  f.add(q);
  
  f.add(y);
  f.add(s);
  f.add(s);
  f.add(e1);
  f.add(k);
  f.add(l1);
  f.add(n);
  f.add(w1);
  f.add(x);
  f.pack();
  
  f.setVisible(true);
}

public static void main(String args[]){ Preguntas obj=new Preguntas(); 

} 
}