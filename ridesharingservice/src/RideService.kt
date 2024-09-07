import java.util.*

object RideService {


    var usermap = mutableMapOf<String?,User>()
    var driversMap= mutableMapOf<String?,Driver>()
    var rideMap = mutableMapOf<String?,Ride>()
    var vechileMap = mutableMapOf<String?,Vechile>()




    fun saveUser(user:User){
        usermap[user.userId] = user
    }

    fun saveDriver(driver: Driver){
        driversMap.put(driver.driverId,driver)
    }


    fun findVechile(userLat:String,userLng: String):List<Vechile>{
        var responseList = mutableListOf<Vechile>()
        vechileMap.values.stream().forEach { i->
            //compute nearest lat long

            responseList.add(i);
        }

        return responseList;

    }
    fun createRide(srcLat:String,srcLng:String,destLat:String,destLng:String,
                   user: User,vechile: Vechile):Ride{
        var id = generateReservationId()


    }

    private fun generateReservationId(): String {
        return "RS" + UUID.randomUUID().toString().substring(0, 8).uppercase(Locale.getDefault())
    }
}