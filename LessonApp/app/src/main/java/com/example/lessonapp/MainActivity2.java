package com.example.lessonapp;

import static com.example.lessonapp.R.drawable.apple;
import static com.example.lessonapp.R.drawable.balloon;
import static com.example.lessonapp.R.drawable.cat;
import static com.example.lessonapp.R.drawable.duck;
import static com.example.lessonapp.R.drawable.egg;
import static com.example.lessonapp.R.drawable.fish;
import static com.example.lessonapp.R.drawable.glass;
import static com.example.lessonapp.R.drawable.hat;
import static com.example.lessonapp.R.drawable.ice_cream;
import static com.example.lessonapp.R.drawable.jelly;
import static com.example.lessonapp.R.drawable.kite;
import static com.example.lessonapp.R.drawable.lemon;
import static com.example.lessonapp.R.drawable.mango;
import static com.example.lessonapp.R.drawable.nest;
import static com.example.lessonapp.R.drawable.orange;
import static com.example.lessonapp.R.drawable.peacock;
import static com.example.lessonapp.R.drawable.question;
import static com.example.lessonapp.R.drawable.rose;
import static com.example.lessonapp.R.drawable.sun;
import static com.example.lessonapp.R.drawable.tree;
import static com.example.lessonapp.R.drawable.umbrella;
import static com.example.lessonapp.R.drawable.violin;
import static com.example.lessonapp.R.drawable.watermelon;
import static com.example.lessonapp.R.drawable.xylophone;
import static com.example.lessonapp.R.drawable.yogurt;
import static com.example.lessonapp.R.drawable.zebra;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.view.View;
import android.widget.Button;

import android.os.Bundle;


public class MainActivity2 extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
        a=findViewById(R.id.a);
        b=findViewById(R.id.b);
        c=findViewById(R.id.c);
        d=findViewById(R.id.d);
        e=findViewById(R.id.e);
        f=findViewById(R.id.f);
        g=findViewById(R.id.g);
        h=findViewById(R.id.h);
        i=findViewById(R.id.i);
        j=findViewById(R.id.j);
        k=findViewById(R.id.k);
        l=findViewById(R.id.l);
        m=findViewById(R.id.m);
        n=findViewById(R.id.n);
        o=findViewById(R.id.o);
        p=findViewById(R.id.p);
        q=findViewById(R.id.q);
        r=findViewById(R.id.r);
        s=findViewById(R.id.s);
        t=findViewById(R.id.t);
        u=findViewById(R.id.u);
        v=findViewById(R.id.v);
        w=findViewById(R.id.w);
        x=findViewById(R.id.x);
        y=findViewById(R.id.y);
        z=findViewById(R.id.z);

        //a
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent (MainActivity2.this,Lesson.class);
                String a ="A for Apple";
                intent.putExtra("picture", apple);
                intent.putExtra("value",a);
                startActivity(intent);
            }

    });
        //b
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent (MainActivity2.this,Lesson.class);
                String b ="B for Balloon";
                intent.putExtra("picture", balloon);
                intent.putExtra("value",b);
                startActivity(intent);
            }

        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent (MainActivity2.this,Lesson.class);
                String c="C for Cat";

                intent.putExtra("picture", cat);
                intent.putExtra("value",c);
                startActivity(intent);
            }

        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent (MainActivity2.this,Lesson.class);
                String d="D for Duck";

                intent.putExtra("picture", duck);
                intent.putExtra("value",d);
                startActivity(intent);
            }

        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent (MainActivity2.this,Lesson.class);
                String e="E for Egg";

                intent.putExtra("picture", egg);
                intent.putExtra("value",e);
                startActivity(intent);
            }

        });
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent (MainActivity2.this,Lesson.class);
                String f="F for Fish";

                intent.putExtra("picture", fish);
                intent.putExtra("value",f);
                startActivity(intent);
            }

        });
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent (MainActivity2.this,Lesson.class);
                String g="G for Glass";

                intent.putExtra("picture",glass);
                intent.putExtra("value",g);
                startActivity(intent);
            }

        });
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent (MainActivity2.this,Lesson.class);
                String h="H for Hat";

                intent.putExtra("picture", hat);
                intent.putExtra("value",h);
                startActivity(intent);
            }

        });
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent (MainActivity2.this,Lesson.class);
                String i="I for Ice Cream";

                intent.putExtra("picture", ice_cream);
                intent.putExtra("value",i);
                startActivity(intent);
            }

        });
        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent (MainActivity2.this,Lesson.class);
                String j="J for Jelly";

                intent.putExtra("picture", jelly);
                intent.putExtra("value",j);
                startActivity(intent);
            }

        });
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent (MainActivity2.this,Lesson.class);
                String k="K for Kite";

                intent.putExtra("picture", kite);
                intent.putExtra("value",k);
                startActivity(intent);
            }

        });
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent (MainActivity2.this,Lesson.class);
                String l="L for Lemon";

                intent.putExtra("picture", lemon);
                intent.putExtra("value",l);
                startActivity(intent);
            }

        });
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent (MainActivity2.this,Lesson.class);
                String m="M for Mango";

                intent.putExtra("picture", mango);
                intent.putExtra("value",m);
                startActivity(intent);
            }

        });
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent (MainActivity2.this,Lesson.class);
                String n="N for Nest";

                intent.putExtra("picture", nest);
                intent.putExtra("value",n);
                startActivity(intent);
            }

        });
        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent (MainActivity2.this,Lesson.class);
                String o="O for Orange";

                intent.putExtra("picture", orange);
                intent.putExtra("value",o);
                startActivity(intent);
            }

        });
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent (MainActivity2.this,Lesson.class);
                String p="P for Peacock";

                intent.putExtra("picture", peacock);
                intent.putExtra("value",p);
                startActivity(intent);
            }

        });
        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent (MainActivity2.this,Lesson.class);
                String q="Q for Question";

                intent.putExtra("picture", question);
                intent.putExtra("value",q);
                startActivity(intent);
            }

        });
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent (MainActivity2.this,Lesson.class);
                String r="R for Rose";

                intent.putExtra("picture", rose);
                intent.putExtra("value",r);
                startActivity(intent);
            }

        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent (MainActivity2.this,Lesson.class);
                String s="S for Sun";

                intent.putExtra("picture", sun);
                intent.putExtra("value",s);
                startActivity(intent);
            }

        });
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent (MainActivity2.this,Lesson.class);
                String t="T for Tree";

                intent.putExtra("picture", tree);
                intent.putExtra("value",t);
                startActivity(intent);
            }

        });
        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent (MainActivity2.this,Lesson.class);
                String u="U for Umbrella";

                intent.putExtra("picture", umbrella);
                intent.putExtra("value",u);
                startActivity(intent);
            }

        });
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent (MainActivity2.this,Lesson.class);
                String v="V for Violin";

                intent.putExtra("picture", violin);
                intent.putExtra("value",v);
                startActivity(intent);
            }

        });
        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent (MainActivity2.this,Lesson.class);
                String w="W for Watermelon";

                intent.putExtra("picture", watermelon);
                intent.putExtra("value",w);
                startActivity(intent);
            }

        });
        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent (MainActivity2.this,Lesson.class);
                String x="X for Xylophone";

                intent.putExtra("picture", xylophone);
                intent.putExtra("value",x);
                startActivity(intent);
            }

        });
        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent (MainActivity2.this,Lesson.class);
                String y="Y for Yogurt";

                intent.putExtra("picture", yogurt);
                intent.putExtra("value",y);
                startActivity(intent);
            }

        });
        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent (MainActivity2.this,Lesson.class);
                String z="Z for Zebra";

                intent.putExtra("picture", zebra);
                intent.putExtra("value",z);
                startActivity(intent);
            }

        });

}
}