package com.binfan.basicStructure.utility

import java.text.ParseException
import java.text.SimpleDateFormat

class Utils {
    companion object {
        fun convertDate(dateString: String): String {
            return try {
                val date = SimpleDateFormat("dd-MM-yyyy").parse(dateString)
                date.toGMTString()
            } catch (exception: ParseException) {
                dateString

            }
        }

        fun convertDateToShort(dateString: String): String {
            return try {
                val date = SimpleDateFormat("dd-MM-yyyy").parse(dateString)
                SimpleDateFormat("dd-MM-yyyy").format(date)
            } catch (exception: ParseException) {
                dateString

            }
        }
    }
}