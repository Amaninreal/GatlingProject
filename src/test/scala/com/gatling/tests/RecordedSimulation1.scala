package com.gatling.tests

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulation1 extends Simulation {

	val httpProtocol = http
		.baseUrl("https://opensource-demo.orangehrmlive.com")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.acceptHeader("application/json")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:135.0) Gecko/20100101 Firefox/135.0")

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Priority" -> "u=0, i",
		"Sec-Fetch-Dest" -> "document",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "same-origin",
		"Sec-Fetch-User" -> "?1",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_1 = Map(
		"If-None-Match" -> """"ZWs3TwZKMQ7IEEFBrjJOSwRM4nXcQgsOPZKkNJnMS5o="""",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"contentType" -> "application/json")

	val headers_2 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Origin" -> "https://opensource-demo.orangehrmlive.com",
		"Priority" -> "u=0, i",
		"Sec-Fetch-Dest" -> "document",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "same-origin",
		"Sec-Fetch-User" -> "?1",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_4 = Map(
		"Cache-Control" -> "no-store, no-cache, must-revalidate, post-check=0, pre-check=0",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_8 = Map(
		"Origin" -> "https://opensource-demo.orangehrmlive.com",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_9 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_10 = Map(
		"Accept" -> "image/avif,image/webp,image/png,image/svg+xml,image/*;q=0.8,*/*;q=0.5",
		"If-None-Match" -> """"x9a7tBQumrDC4oPuNRP8X1//Ehqbu0TltKlvsDyUSsc="""",
		"Priority" -> "u=5",
		"Sec-Fetch-Dest" -> "image",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_11 = Map(
		"Accept" -> "image/avif,image/webp,image/png,image/svg+xml,image/*;q=0.8,*/*;q=0.5",
		"If-None-Match" -> """"Bim49l87Fyr7NzdEvexWznblfleg8hRbgwK6cvwJNts="""",
		"Priority" -> "u=5",
		"Sec-Fetch-Dest" -> "image",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_12 = Map(
		"Accept" -> "image/avif,image/webp,image/png,image/svg+xml,image/*;q=0.8,*/*;q=0.5",
		"If-None-Match" -> """"3xooZWhw7ljZLQ7SDqE5SDrOFME2ACmB0fTP5fVJ97c="""",
		"Priority" -> "u=5",
		"Sec-Fetch-Dest" -> "image",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_13 = Map(
		"Accept" -> "image/avif,image/webp,image/png,image/svg+xml,image/*;q=0.8,*/*;q=0.5",
		"If-None-Match" -> """"HPYdh9SELe3uY6bErmxV4OXbXIAviMN0mBPv6nsoIpo="""",
		"Priority" -> "u=5",
		"Sec-Fetch-Dest" -> "image",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin")



	val scn = scenario("RecordedSimulation1")
		.exec(http("Login Page")
			.get("/web/index.php/auth/login")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/web/index.php/core/i18n/messages")
			.headers(headers_1)))
		.pause(9)
		.exec(http("Login with Valid Credentials")
			.post("/web/index.php/auth/validate")
			.headers(headers_2)
			.formParam("_token", "fa6bf7c7d85487412ed6d3c671ec1eab.H0ysSmnZN3ydcPJzfNZ8rU47_QJIVMyRhqfQcVd3hMw.cnvdLROIXDnFCrMFF5RJnQZYmHISJK3EwM3hCWEj1Z16D-ozHesCJPxApw")
			.formParam("username", "Admin")
			.formParam("password", "admin123")
			.resources(http("request_3")
			.get("/web/index.php/core/i18n/messages")
			.headers(headers_1),
            http("request_4")
			.get("/web/index.php/api/v2/dashboard/employees/action-summary")
			.headers(headers_4),
            http("request_5")
			.get("/web/index.php/api/v2/dashboard/shortcuts")
			.headers(headers_4),
            http("request_6")
			.get("/web/index.php/api/v2/dashboard/employees/time-at-work?timezoneOffset=5.5&currentDate=2025-02-23&currentTime=17:55")
			.headers(headers_4),
            http("request_7")
			.get("/web/index.php/api/v2/dashboard/employees/locations")
			.headers(headers_4),
            http("request_8")
			.post("/web/index.php/events/push")
			.headers(headers_8),
            http("request_9")
			.get("/web/index.php/api/v2/buzz/feed?limit=5&offset=0&sortOrder=DESC&sortField=share.createdAtUtc")
			.headers(headers_9),
            http("request_10")
			.get("/web/index.php/pim/viewPhoto/empNumber/22")
			.headers(headers_10),
            http("request_11")
			.get("/web/index.php/buzz/photo/9")
			.headers(headers_11),
            http("request_12")
			.get("/web/index.php/pim/viewPhoto/empNumber/11")
			.headers(headers_12),
            http("request_13")
			.get("/web/index.php/pim/viewPhoto/empNumber/9")
			.headers(headers_13),
            http("request_14")
			.get("/web/index.php/api/v2/dashboard/employees/leaves?date=2025-02-23")
			.headers(headers_4),
            http("request_15")
			.get("/web/index.php/api/v2/dashboard/employees/subunit")
			.headers(headers_4),
            http("Logout")
			.get("/web/index.php/auth/logout")
			.headers(headers_0),
            http("request_17")
			.get("/web/index.php/core/i18n/messages")
			.headers(headers_1)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
