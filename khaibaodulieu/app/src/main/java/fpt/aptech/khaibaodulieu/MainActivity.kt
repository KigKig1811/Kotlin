package fpt.aptech.khaibaodulieu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.LogPrinter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Khai bao du lieu
//        var a : String = ""
//        a="Kinh"
//        a.toInt()
//        val b: String ="Trinh Ngoc"

        //Null safery
//        var a:String?="kinh"//cho phep gan lai gia tri bang null
//        a=null

//            var b:String ="kinh"!! k cho phep bien co gia tri bang null

        //if else
//        var a: Int=18
//        var b: Int=11
//        if(a>b){
//            Log.d("a","Gia tri lon nhat la"+a)
//        }else{
//            Log.d("a","Gia tri lon nhat la"+b)
//        }
        // Mang _ Array

        //Cach 1:
        var mangso : IntArray= intArrayOf(1,2,3,4,5,6,7,8,9)
        Log.d("AAA",mangso.get(1).toString())
        //Cach 2
        var mangten:List<String> = listOf("hoa","phat","Hut")
        Log.d("AAA",mangten.get(1))
        // Cách 3
        var mangten1:ArrayList<String> =ArrayList()
        mangten1.add("Kinh")
        mangten1.add("Dep")
        mangten1.add("trai")
        Log.d("AAA",mangten1.get(0))
        Log.d("AAA",mangten1.get(1))
        Log.d("AAA",mangten1.get(2))
        //Kiểm tra số phần tử có trong mảng
        Log.d("AAA",mangten1.size.toString())
        //Xoa phan tu trong mang
        mangten1.remove("trai")
        mangten1.removeAt(1)
        // Sửa phần  tử trong mảng
        mangten1.set(0,"Kinh dep trai")
        Log.d("AAA",mangten1.get(0))

    }
}