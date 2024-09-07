class Vechile {
    var vechileId:String?=null
    var vechileName:String?=null
    var vechileNum:String?=null
    var vechileClass:VechileClass?=null
    var vechileLat:String?=null
    var vechileLng:String?=null
    var driver:Driver?=null
    var isAvailable:Boolean=false




    fun isAvailable(vechileNum:String):Boolean{

        if(!isAvailable)return false;

        return true;

    }
}