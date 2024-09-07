import java.time.LocalDate

class Ride {
    var rideId:String?=null
    var sourceLat:String?=null
    var sourceLng:String?=null
    var destinationLat:String?=null
    var destinationLng:String?=null
    var vechile:Vechile?=null
    var user:User?=null
    var bookingDate:LocalDate?=null
    var rideStatus:RideStatus?=null
}