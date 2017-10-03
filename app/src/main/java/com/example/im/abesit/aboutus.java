package com.example.im.abesit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TextView;


public class aboutus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);
        ScrollView sv=(ScrollView)findViewById(R.id.scrollView1);
        TextView tv=new TextView(this);
        tv.setText("•\tThe ABES Institute of Technology (College Code- 290) embarked on its mission in the field of Technical and Management Education in the year 2007- 08.\n" +
                "\n" +
                "•\tProminent Location at National Highway-24 (near Delhi-Ghaziabad Border).\n" +
                "\n" +
                "•\t‘Best Engineering College (self financed) in NCR and also Awarded from Anand Kumar (Super 30 Founder).\n" +
                "\n" +
                "•\tVery decent, green, clean and world class infrastructure.\n" +
                "\n" +
                "•\tAir-conditioned Class rooms and tutorial rooms.\n" +
                "\n" +
                "•\tUltra modern Auditorium and Seminar Hall with latest Audio-Visual aids.\n" +
                "\n" +
                "•\tIn-campus boy’s hostel, girl’s hostel and faculty residence with strict security monitoring.\n" +
                "\n" +
                "•\tPlayground, Hard courts and Amphitheater of 1200 seating capacity.\n" +
                "\n" +
                "•\tState-of-art Library with OPAC system.\n" +
                "\n" +
                "•\tCompetent and qualified faculty with rich academic & industry experience.\n" +
                "\n" +
                "•\tIn campus facilities such as Stationary Shop, Snacks Café, Laundry Shop.\n" +
                "\n" +
                "•\tAcademic Excellence Award Scheme & Grants for Meritorious Candidates.\n" +
                "\n" +
                "•\tAcademic Excellence Awards (given in Convocation).\n" +
                "\n" +
                "•\tABESIT CRC is effectively functioning in conducting placement activities.\n" +
                "\n" +
                "•\tBureau of Training & Development\n" +
                "\n" +
                "•\tBureau of Training & Development is responsible for conducting in-house training programs on various issues.\n" +
                "\n" +
                "ABESIT Innovation Centre\n" +
                "\n" +
                "•\tStudents have hands on experience of implementing their new ideas towards problem solving for mankind. These problems may be of industry, urban area or rural area etc.\n" +
                "\n" +
                "\n" +
                "•\t(ABESIT Bureau of Training & Development and ABESIT Innovation Centre are playing vital role in enhancing the capabilities and competencies of Students so that they became employable and professionally strong).\n");
        sv.addView(tv);

    }
}
