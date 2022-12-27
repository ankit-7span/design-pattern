package com.example.demo.design.pattern.structural.decorator;

public class SupportReport implements Report {
 
  @Override
  public Object[][] getReportData(String reportId) {
    return null;
  }
 
  @Override
  public String getFirstColumnData() {
    return "Support data";
  }
   
}