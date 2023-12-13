package ma.ofppt.canvastp1

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.View

class MyCanvas(context: Context,attrs : AttributeSet) : View(context,attrs) {
    var cx = 300f
    var cy = 300f
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        var paintFill = Paint()
        paintFill.color = Color.RED
        paintFill.style = Paint.Style.FILL
           var paintStroke = Paint()
        paintStroke.color = Color.BLACK
        paintStroke.style = Paint.Style.STROKE
        paintStroke.strokeWidth =4f

        var paintBG = Paint()
        paintBG.color = Color.GREEN
        paintBG.style = Paint.Style.FILL
        canvas.drawRect(0f,0f, this.width.toFloat(), this.height.toFloat(),paintBG)
        canvas.drawCircle(cx,cy,100f,paintFill)
        canvas.drawCircle(cx,cy,100f,paintStroke)
        var x=0f
        var y=200f
        var path = Path()
        path.moveTo(x,y)
        for(i in 0..5){
            x+=200
            path.lineTo(x,y)
            y+=200
            path.lineTo(x,y)
        }
        //path.lineTo(0f,y)
         //path.close()
        canvas.drawPath(path,paintFill)


    }
}