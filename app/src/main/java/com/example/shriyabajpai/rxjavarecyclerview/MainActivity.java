package com.example.shriyabajpai.rxjavarecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;


public class MainActivity extends AppCompatActivity {
     private static final String TAG=MainActivity.class.getSimpleName();
     private TextView txt;
     private io.reactivex.Observable<String> mObservable;
     private Observer<String> mObserver;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView) findViewById(R.id.text_name);
        mObservable = mObservable.just("hello from rx android");


        mObserver = new Observer<String>() {

            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(String s) {
                txt.setText(s);

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        };





    }

    public void buttonOnClick(View view) {
    mObservable.subscribe(mObserver);
    }

}
