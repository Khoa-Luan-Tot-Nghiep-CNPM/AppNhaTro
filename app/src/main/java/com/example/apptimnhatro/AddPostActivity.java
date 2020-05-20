package com.example.apptimnhatro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;

import com.vinay.stepview.HorizontalStepView;
import com.vinay.stepview.models.Step;

import java.util.ArrayList;
import java.util.List;

public class AddPostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_post);

        HorizontalStepView horizontalStepView = findViewById(R.id.sv_AddInformation);

        List<Step> stepList = new ArrayList<>();
        stepList.add(new Step("Thông tin", Step.State.COMPLETED));
        stepList.add(new Step("Địa chỉ", Step.State.COMPLETED));
        stepList.add(new Step("Tiện ích", Step.State.CURRENT));
        stepList.add(new Step("Xác nhận"));

        horizontalStepView.setSteps(stepList);

        horizontalStepView

                .setCompletedStepIcon(AppCompatResources.getDrawable(this, R.drawable.icon_infor))
                .setNotCompletedStepIcon(AppCompatResources.getDrawable(this, R.drawable.icon_complete))
                .setCurrentStepIcon(AppCompatResources.getDrawable(this, R.drawable.icon_marker))

                .setCompletedStepTextColor(Color.parseColor("#000080"))
                .setNotCompletedStepTextColor(Color.parseColor("#808080"))
                .setCurrentStepTextColor(Color.parseColor("#808080"))
                .setCompletedLineColor(Color.parseColor("#000080"))
                .setNotCompletedLineColor(Color.parseColor("#808080"))
                .setTextSize(17) // Default: 14sp
                .setCircleRadius(15) // Default: ~11.2dp
                .setLineLength(50); // Default: ~34dp

    }
}
