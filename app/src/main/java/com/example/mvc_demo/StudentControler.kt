package com.example.mvc_demo

class StudentControler(var model:Student,var view:MainActivity) {
    fun getStudentName():String
    {
        return model.Name
    }
    fun getStudentRollNo():String
    {
        return model.rollNo
    }
    fun setStudentName(name:String)
    {
        model.Name=name
    }
    fun setStudentRollName(roll:String)
    {
        model.rollNo=roll;
    }
    fun UpdateView()
    {
        view.printDetail(model.Name,model.rollNo)
    }
}