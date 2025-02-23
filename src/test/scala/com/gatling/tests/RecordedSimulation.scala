package com.gatling.tests

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulation extends Simulation {

	val httpProtocol = http
		.baseUrl("https://opensource-demo.orangehrmlive.com")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.acceptHeader("*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:135.0) Gecko/20100101 Firefox/135.0")

	val headers_0 = Map(
		"Accept" -> "image/avif,image/webp,image/png,image/svg+xml,image/*;q=0.8,*/*;q=0.5",
		"Priority" -> "u=5, i",
		"Sec-Fetch-Dest" -> "image",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "cross-site")

	val headers_1 = Map(
		"Content-Type" -> "text/plain;charset=UTF-8",
		"Origin" -> "https://www.youtube.com",
		"Priority" -> "u=4",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"X-Goog-Visitor-Id" -> "CgtXdUNQaUYteEhFayiDmOy9BjIKCgJJThIEGgAgbQ%3D%3D")

	val headers_2 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Priority" -> "u=0, i",
		"Sec-Fetch-Dest" -> "document",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "none",
		"Sec-Fetch-User" -> "?1",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_3 = Map(
		"Accept" -> "image/avif,image/webp,image/png,image/svg+xml,image/*;q=0.8,*/*;q=0.5",
		"Priority" -> "u=6",
		"Sec-Fetch-Dest" -> "image",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_4 = Map(
		"Priority" -> "u=1",
		"Sec-Fetch-Dest" -> "script",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_5 = Map(
		"Accept" -> "application/json",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"contentType" -> "application/json")

	val headers_6 = Map(
		"Accept" -> "image/avif,image/webp,image/png,image/svg+xml,image/*;q=0.8,*/*;q=0.5",
		"Priority" -> "u=4, i",
		"Sec-Fetch-Dest" -> "image",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_7 = Map(
		"Accept" -> "image/avif,image/webp,image/png,image/svg+xml,image/*;q=0.8,*/*;q=0.5",
		"Priority" -> "u=5, i",
		"Sec-Fetch-Dest" -> "image",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_8 = Map(
		"Cache-Control" -> "no-cache",
		"Origin" -> "https://www.youtube.com",
		"Pragma" -> "no-cache",
		"Priority" -> "u=4",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "cross-site")

	val headers_11 = Map(
		"Priority" -> "u=4",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_12 = Map(
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"X-Goog-Event-Time" -> "1740312633578",
		"X-Goog-Request-Time" -> "1740313135357",
		"X-Goog-Visitor-Id" -> "CgtXdUNQaUYteEhFayiDmOy9BjIKCgJJThIEGgAgbQ%3D%3D",
		"X-YouTube-Ad-Signals" -> "dt=1740311557228&flash=0&frm&u_tz=330&u_his=7&u_h=768&u_w=1366&u_ah=741&u_aw=1294&u_cd=24&bc=31&bih=656&biw=1294&brdim=72%2C27%2C72%2C27%2C1294%2C27%2C1294%2C741%2C1294%2C656&vis=2&wgl=true&ca_type=image&bid=ANyPxKr4ywf4cb0BBXAZjhwYZ5zD3k0dt1uqBwbTWCRvv3_j4gfl50j4dTW6x5MeAZ28uQIn-1cAe9qEnA2fmMcBq4U8K0i0Qg",
		"X-YouTube-Client-Name" -> "1",
		"X-YouTube-Client-Version" -> "2.20250221.00.00",
		"X-YouTube-Device" -> "cbr=Firefox&cbrver=135.0&ceng=Gecko&cengver=135.0&cos=X11&cplatform=DESKTOP",
		"X-YouTube-Page-CL" -> "729371111",
		"X-YouTube-Page-Label" -> "youtube.desktop.web_20250221_00_RC00",
		"X-YouTube-Time-Zone" -> "Asia/Kolkata",
		"X-YouTube-Utc-Offset" -> "330")

	val headers_14 = Map(
		"Content-Type" -> "application/json",
		"Origin" -> "https://www.youtube.com",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"X-Goog-Event-Time" -> "1740312633589",
		"X-Goog-Request-Time" -> "1740313135485",
		"X-Goog-Visitor-Id" -> "CgtXdUNQaUYteEhFayiDmOy9BjIKCgJJThIEGgAgbQ%3D%3D",
		"X-YouTube-Ad-Signals" -> "dt=1740311557228&flash=0&frm&u_tz=330&u_his=7&u_h=768&u_w=1366&u_ah=741&u_aw=1294&u_cd=24&bc=31&bih=656&biw=1294&brdim=72%2C27%2C72%2C27%2C1294%2C27%2C1294%2C741%2C1294%2C656&vis=2&wgl=true&ca_type=image&bid=ANyPxKr4ywf4cb0BBXAZjhwYZ5zD3k0dt1uqBwbTWCRvv3_j4gfl50j4dTW6x5MeAZ28uQIn-1cAe9qEnA2fmMcBq4U8K0i0Qg",
		"X-YouTube-Client-Name" -> "1",
		"X-YouTube-Client-Version" -> "2.20250221.00.00",
		"X-YouTube-Device" -> "cbr=Firefox&cbrver=135.0&ceng=Gecko&cengver=135.0&cos=X11&cplatform=DESKTOP",
		"X-YouTube-Page-CL" -> "729371111",
		"X-YouTube-Page-Label" -> "youtube.desktop.web_20250221_00_RC00",
		"X-YouTube-Time-Zone" -> "Asia/Kolkata",
		"X-YouTube-Utc-Offset" -> "330")

	val headers_15 = Map(
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"X-Goog-Event-Time" -> "1740312707669",
		"X-Goog-Request-Time" -> "1740313135685",
		"X-Goog-Visitor-Id" -> "CgtXdUNQaUYteEhFayiDmOy9BjIKCgJJThIEGgAgbQ%3D%3D",
		"X-YouTube-Ad-Signals" -> "dt=1740311557228&flash=0&frm&u_tz=330&u_his=7&u_h=768&u_w=1366&u_ah=741&u_aw=1294&u_cd=24&bc=31&bih=656&biw=1294&brdim=72%2C27%2C72%2C27%2C1294%2C27%2C1294%2C741%2C1294%2C656&vis=2&wgl=true&ca_type=image&bid=ANyPxKr4ywf4cb0BBXAZjhwYZ5zD3k0dt1uqBwbTWCRvv3_j4gfl50j4dTW6x5MeAZ28uQIn-1cAe9qEnA2fmMcBq4U8K0i0Qg",
		"X-YouTube-Client-Name" -> "1",
		"X-YouTube-Client-Version" -> "2.20250221.00.00",
		"X-YouTube-Device" -> "cbr=Firefox&cbrver=135.0&ceng=Gecko&cengver=135.0&cos=X11&cplatform=DESKTOP",
		"X-YouTube-Page-CL" -> "729371111",
		"X-YouTube-Page-Label" -> "youtube.desktop.web_20250221_00_RC00",
		"X-YouTube-Time-Zone" -> "Asia/Kolkata",
		"X-YouTube-Utc-Offset" -> "330")

	val headers_16 = Map(
		"Content-Type" -> "application/json",
		"Origin" -> "https://www.youtube.com",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"X-Goog-Event-Time" -> "1740312726063",
		"X-Goog-Request-Time" -> "1740313135814",
		"X-Goog-Visitor-Id" -> "CgtXdUNQaUYteEhFayiDmOy9BjIKCgJJThIEGgAgbQ%3D%3D",
		"X-YouTube-Ad-Signals" -> "dt=1740311557228&flash=0&frm&u_tz=330&u_his=7&u_h=768&u_w=1366&u_ah=741&u_aw=1294&u_cd=24&bc=31&bih=656&biw=1294&brdim=72%2C27%2C72%2C27%2C1294%2C27%2C1294%2C741%2C1294%2C656&vis=2&wgl=true&ca_type=image&bid=ANyPxKr4ywf4cb0BBXAZjhwYZ5zD3k0dt1uqBwbTWCRvv3_j4gfl50j4dTW6x5MeAZ28uQIn-1cAe9qEnA2fmMcBq4U8K0i0Qg",
		"X-YouTube-Client-Name" -> "1",
		"X-YouTube-Client-Version" -> "2.20250221.00.00",
		"X-YouTube-Device" -> "cbr=Firefox&cbrver=135.0&ceng=Gecko&cengver=135.0&cos=X11&cplatform=DESKTOP",
		"X-YouTube-Page-CL" -> "729371111",
		"X-YouTube-Page-Label" -> "youtube.desktop.web_20250221_00_RC00",
		"X-YouTube-Time-Zone" -> "Asia/Kolkata",
		"X-YouTube-Utc-Offset" -> "330")

	val headers_18 = Map(
		"Content-Type" -> "application/json",
		"Origin" -> "https://www.youtube.com",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"X-Goog-Event-Time" -> "1740312847302",
		"X-Goog-Request-Time" -> "1740313135949",
		"X-Goog-Visitor-Id" -> "CgtXdUNQaUYteEhFayiDmOy9BjIKCgJJThIEGgAgbQ%3D%3D",
		"X-YouTube-Ad-Signals" -> "dt=1740311557228&flash=0&frm&u_tz=330&u_his=7&u_h=768&u_w=1366&u_ah=741&u_aw=1294&u_cd=24&bc=31&bih=656&biw=1294&brdim=72%2C27%2C72%2C27%2C1294%2C27%2C1294%2C741%2C1294%2C656&vis=2&wgl=true&ca_type=image&bid=ANyPxKr4ywf4cb0BBXAZjhwYZ5zD3k0dt1uqBwbTWCRvv3_j4gfl50j4dTW6x5MeAZ28uQIn-1cAe9qEnA2fmMcBq4U8K0i0Qg",
		"X-YouTube-Client-Name" -> "1",
		"X-YouTube-Client-Version" -> "2.20250221.00.00",
		"X-YouTube-Device" -> "cbr=Firefox&cbrver=135.0&ceng=Gecko&cengver=135.0&cos=X11&cplatform=DESKTOP",
		"X-YouTube-Page-CL" -> "729371111",
		"X-YouTube-Page-Label" -> "youtube.desktop.web_20250221_00_RC00",
		"X-YouTube-Time-Zone" -> "Asia/Kolkata",
		"X-YouTube-Utc-Offset" -> "330")

	val headers_19 = Map(
		"Content-Type" -> "application/json",
		"Origin" -> "https://www.youtube.com",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"X-Goog-Event-Time" -> "1740312851566",
		"X-Goog-Request-Time" -> "1740313136082",
		"X-Goog-Visitor-Id" -> "CgtXdUNQaUYteEhFayiDmOy9BjIKCgJJThIEGgAgbQ%3D%3D",
		"X-YouTube-Ad-Signals" -> "dt=1740311557228&flash=0&frm&u_tz=330&u_his=7&u_h=768&u_w=1366&u_ah=741&u_aw=1294&u_cd=24&bc=31&bih=656&biw=1294&brdim=72%2C27%2C72%2C27%2C1294%2C27%2C1294%2C741%2C1294%2C656&vis=2&wgl=true&ca_type=image&bid=ANyPxKr4ywf4cb0BBXAZjhwYZ5zD3k0dt1uqBwbTWCRvv3_j4gfl50j4dTW6x5MeAZ28uQIn-1cAe9qEnA2fmMcBq4U8K0i0Qg",
		"X-YouTube-Client-Name" -> "1",
		"X-YouTube-Client-Version" -> "2.20250221.00.00",
		"X-YouTube-Device" -> "cbr=Firefox&cbrver=135.0&ceng=Gecko&cengver=135.0&cos=X11&cplatform=DESKTOP",
		"X-YouTube-Page-CL" -> "729371111",
		"X-YouTube-Page-Label" -> "youtube.desktop.web_20250221_00_RC00",
		"X-YouTube-Time-Zone" -> "Asia/Kolkata",
		"X-YouTube-Utc-Offset" -> "330")

	val headers_23 = Map(
		"Content-Type" -> "text/plain;charset=UTF-8",
		"Origin" -> "https://www.linkedin.com",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"csrf-token" -> "ajax:0697974370868059587",
		"x-RestLi-Protocol-Version" -> "2.0.0",
		"x-li-accept" -> "application/vnd.linkedin.normalized+json+2.1",
		"x-li-page-instance" -> "urn:li:page:feed_index_index;637d4b56-e982-4a7b-9420-f14276ac19f1",
		"x-li-query-accept" -> "application/graphql",
		"x-li-query-map" -> """{"topicToGraphQLQueryParams":{"conversationsBroadcastTopic":{"queryId":"voyagerMessagingDashMessengerRealtimeDecoration.441c03c3f294c7b672b2feb65067caa3","variables":{},"extensions":{}},"conversationsTopic":{"queryId":"voyagerMessagingDashMessengerRealtimeDecoration.441c03c3f294c7b672b2feb65067caa3","variables":{},"extensions":{}},"conversationDeletesBroadcastTopic":{"queryId":"voyagerMessagingDashMessengerRealtimeDecoration.282abe5fa1a242cb76825c32dbbfaede","variables":{},"extensions":{}},"conversationDeletesTopic":{"queryId":"voyagerMessagingDashMessengerRealtimeDecoration.282abe5fa1a242cb76825c32dbbfaede","variables":{},"extensions":{}},"messageReactionSummariesBroadcastTopic":{"queryId":"voyagerMessagingDashMessengerRealtimeDecoration.ba93ee1e426e02f0616cdc375ea8a035","variables":{},"extensions":{}},"messageReactionSummariesTopic":{"queryId":"voyagerMessagingDashMessengerRealtimeDecoration.ba93ee1e426e02f0616cdc375ea8a035","variables":{},"extensions":{}},"messageSeenReceiptsBroadcastTopic":{"queryId":"voyagerMessagingDashMessengerRealtimeDecoration.6848ca49032983a615be1d37bb545179","variables":{},"extensions":{}},"messageSeenReceiptsTopic":{"queryId":"voyagerMessagingDashMessengerRealtimeDecoration.6848ca49032983a615be1d37bb545179","variables":{},"extensions":{}},"messagesBroadcastTopic":{"queryId":"voyagerMessagingDashMessengerRealtimeDecoration.fc1135038175599c85c72de9647a8c36","variables":{},"extensions":{}},"messagesTopic":{"queryId":"voyagerMessagingDashMessengerRealtimeDecoration.fc1135038175599c85c72de9647a8c36","variables":{},"extensions":{}},"replySuggestionBroadcastTopic":{"queryId":"voyagerMessagingDashMessengerRealtimeDecoration.412964c3f7f5a67fb0e56b6bb3a00028","variables":{},"extensions":{}},"replySuggestionTopicV2":{"queryId":"voyagerMessagingDashMessengerRealtimeDecoration.412964c3f7f5a67fb0e56b6bb3a00028","variables":{},"extensions":{}},"typingIndicatorsBroadcastTopic":{"queryId":"voyagerMessagingDashMessengerRealtimeDecoration.8a3db3519f616215d85657da21c07605","variables":{},"extensions":{}},"typingIndicatorsTopic":{"queryId":"voyagerMessagingDashMessengerRealtimeDecoration.8a3db3519f616215d85657da21c07605","variables":{},"extensions":{}},"messagingSecondaryPreviewBannerTopic":{"queryId":"voyagerMessagingDashRealtimeDecoration.a0228e467df9f2ebd7c4c96d06b7c1f8","variables":{},"extensions":{}},"reactionsTopic":{"queryId":"liveVideoVoyagerSocialDashRealtimeDecoration.b8b33dedca7efbe34f1d7e84c3b3aa81","variables":{},"extensions":{}},"commentsTopic":{"queryId":"liveVideoVoyagerSocialDashRealtimeDecoration.9eed56392e681683996f77e403981621","variables":{},"extensions":{}},"reactionsOnCommentsTopic":{"queryId":"liveVideoVoyagerSocialDashRealtimeDecoration.0a181b05b3751f72ae3eb489b77e3245","variables":{},"extensions":{}},"socialPermissionsPersonalTopic":{"queryId":"liveVideoVoyagerSocialDashRealtimeDecoration.170bf3bfbcca1da322e34f34f37fb954","variables":{},"extensions":{}},"liveVideoPostTopic":{"queryId":"liveVideoVoyagerFeedDashLiveUpdatesRealtimeDecoration.f6cb0d6fa726c9c0c1ffc6f152ee8da8","variables":{},"extensions":{}},"generatedJobDescriptionsTopic":{"queryId":"voyagerHiringDashRealtimeDecoration.58501bc70ea8ce6b858527fb1be95007","variables":{},"extensions":{}},"messageDraftsTopic":{"queryId":"voyagerMessagingDashMessengerRealtimeDecoration.ea999d7db28b647af21f47b0c9093d83","variables":{},"extensions":{}},"conversationDraftsTopic":{"queryId":"voyagerMessagingDashMessengerRealtimeDecoration.e5f056134f6bdb3c9d1eb66015f236c4","variables":{},"extensions":{}},"messageDraftDeletesTopic":{"queryId":"voyagerMessagingDashMessengerRealtimeDecoration.e3e4c7121838321a42752b55f487a73e","variables":{},"extensions":{}},"conversationDraftDeletesTopic":{"queryId":"voyagerMessagingDashMessengerRealtimeDecoration.5288036a2c0e63f49d34ee32b139976c","variables":{},"extensions":{}},"eventToastsTopic":{"queryId":"voyagerEventsDashProfessionalEventsRealtimeResource.6b42abd3511e267e84a6765257deea50","variables":{},"extensions":{}},"coachStreamingResponsesTopic":{"queryId":"voyagerCoachDashGaiRealtimeDecoration.b355634177355c25591d5aac15d45fdb","variables":{},"extensions":{}},"realtimeSearchResultClustersTopic":{"queryId":"voyagerSearchDashRealtimeDecoration.5fadaa2da272132c7bb6368786eec086","variables":{},"extensions":{}},"memberVerificationResultsPersonalTopic":{"queryId":"voyagerTrustDashVerificationRealTimeDecoration.78d27e95dba97623a3f209212e7ecbf3","variables":{},"extensions":{}}}}""",
		"x-li-realtime-session" -> "3874c82d-2825-4401-8b49-8cf33a5d02dc",
		"x-li-recipe-accept" -> "application/vnd.linkedin.normalized+json+2.1",
		"x-li-recipe-map" -> """{"inAppAlertsTopic":"com.linkedin.voyager.dash.deco.identity.notifications.InAppAlert-52","professionalEventsTopic":"com.linkedin.voyager.dash.deco.events.ProfessionalEventDetailPage-59","tabBadgeUpdateTopic":"com.linkedin.voyager.dash.deco.notifications.RealtimeBadgingItemCountsEvent-1","topCardLiveVideoTopic":"com.linkedin.voyager.dash.deco.video.TopCardLiveVideo-10"}""",
		"x-li-track" -> """{"clientVersion":"1.13.30865","mpVersion":"1.13.30865","osName":"web","timezoneOffset":5.5,"timezone":"Asia/Kolkata","deviceFormFactor":"DESKTOP","mpName":"voyager-web","displayDensity":1,"displayWidth":1366,"displayHeight":768}""")

	val headers_24 = Map(
		"Access-Control-Request-Headers" -> "authorization,content-type,x-goog-authuser",
		"Access-Control-Request-Method" -> "POST",
		"Origin" -> "https://mail.google.com",
		"Priority" -> "u=4",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-site")

	val headers_25 = Map(
		"Content-Type" -> "application/json+protobuf",
		"Origin" -> "https://mail.google.com",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-site",
		"X-Goog-AuthUser" -> "1",
		"authorization" -> "SAPISIDHASH 1740313141_9be7d468780dfdfb5600553d6ab650b3a0906134")

	val headers_26 = Map(
		"Access-Control-Request-Headers" -> "authorization,x-goog-authuser,x-webchannel-content-type",
		"Access-Control-Request-Method" -> "POST",
		"Origin" -> "https://mail.google.com",
		"Priority" -> "u=4",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-site")

	val headers_27 = Map(
		"Origin" -> "https://mail.google.com",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-site",
		"X-Goog-AuthUser" -> "1",
		"X-WebChannel-Content-Type" -> "application/json+protobuf",
		"authorization" -> "SAPISIDHASH 1740313143_3cea09154ba8a1782cd61f17aef35d0c57473912")

	val headers_28 = Map(
		"Access-Control-Request-Headers" -> "authorization,x-goog-authuser",
		"Access-Control-Request-Method" -> "GET",
		"Origin" -> "https://mail.google.com",
		"Priority" -> "u=4",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-site")

	val headers_30 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Origin" -> "https://opensource-demo.orangehrmlive.com",
		"Priority" -> "u=0, i",
		"Sec-Fetch-Dest" -> "document",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "same-origin",
		"Sec-Fetch-User" -> "?1",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_31 = Map(
		"Accept" -> "application/json",
		"If-None-Match" -> """"ZWs3TwZKMQ7IEEFBrjJOSwRM4nXcQgsOPZKkNJnMS5o="""",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"contentType" -> "application/json")

	val headers_35 = Map(
		"Accept" -> "application/json",
		"Cache-Control" -> "no-store, no-cache, must-revalidate, post-check=0, pre-check=0",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_38 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_42 = Map(
		"Accept" -> "application/json",
		"Origin" -> "https://opensource-demo.orangehrmlive.com",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_48 = Map(
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"X-Goog-Event-Time" -> "1740313176011",
		"X-Goog-Request-Time" -> "1740313176013",
		"X-Goog-Visitor-Id" -> "CgtXdUNQaUYteEhFayiDmOy9BjIKCgJJThIEGgAgbQ%3D%3D",
		"X-YouTube-Ad-Signals" -> "dt=1740311557228&flash=0&frm&u_tz=330&u_his=7&u_h=768&u_w=1366&u_ah=741&u_aw=1294&u_cd=24&bc=31&bih=656&biw=1294&brdim=72%2C27%2C72%2C27%2C1294%2C27%2C1294%2C741%2C1294%2C656&vis=2&wgl=true&ca_type=image&bid=ANyPxKr4ywf4cb0BBXAZjhwYZ5zD3k0dt1uqBwbTWCRvv3_j4gfl50j4dTW6x5MeAZ28uQIn-1cAe9qEnA2fmMcBq4U8K0i0Qg",
		"X-YouTube-Client-Name" -> "1",
		"X-YouTube-Client-Version" -> "2.20250221.00.00",
		"X-YouTube-Device" -> "cbr=Firefox&cbrver=135.0&ceng=Gecko&cengver=135.0&cos=X11&cplatform=DESKTOP",
		"X-YouTube-Page-CL" -> "729371111",
		"X-YouTube-Page-Label" -> "youtube.desktop.web_20250221_00_RC00",
		"X-YouTube-Time-Zone" -> "Asia/Kolkata",
		"X-YouTube-Utc-Offset" -> "330")

	val headers_49 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Priority" -> "u=0, i",
		"Sec-Fetch-Dest" -> "document",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "same-origin",
		"Sec-Fetch-User" -> "?1",
		"Upgrade-Insecure-Requests" -> "1")

    val uri2 = "https://www.linkedin.com/realtime/realtimeFrontendClientConnectivityTracking"
    val uri3 = "https://www.youtube.com"
    val uri4 = "https://signaler-pa.clients6.google.com/punctual"
    val uri5 = "https://rr1---sn-gxo0cgv5qc5oq-3o0e.googlevideo.com/videoplayback"
    val uri6 = "https://ssl.gstatic.com/ui/v1/icons/mail/images/cleardot.gif"

	val scn = scenario("RecordedSimulation")
		.exec(http("request_0")
			.get(uri6 + "?zx=b8homc9tyult")
			.headers(headers_0))
		.pause(3)
		.exec(http("request_1")
			.post(uri3 + "/api/stats/qoe?fmt=308&afmt=251&cpn=NcTQ4tfEEejOYREk&el=detailpage&ns=yt&fexp=v1%2C23986023%2C18621%2C49740%2C384977%2C60173%2C67153%2C133212%2C14625955%2C11684381%2C53408%2C9105%2C18310%2C4420%2C2821%2C59112%2C19100%2C8479%2C19339%2C18644%2C13046%2C1823%2C18242%2C28968%2C12968%2C2156%2C65%2C10501%2C3025%2C391%2C2590%2C10184%2C13730%2C9251%2C3480%2C2024%2C495%2C6731%2C2819%2C961%2C5335%2C11411%2C207%2C1373%2C1817%2C3063%2C238%2C3619%2C5196%2C1204%2C107%2C22%2C3473%2C1320%2C1%2C1015%2C1684%2C600%2C902%2C572%2C4758%2C712&cl=728418168&seq=74&docid=9F5ll-qS76I&ei=oQy7Z6_bGYuv9fwPls-8kA0&event=streamingstats&feature=BFa&plid=AAYuzeV6f0e8CyVQ&referrer=https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3D9mn5krn6xnk%26list%3DPLhW3qG5bs-L-YQKiESvWmzIlS-dMo1b4D%26index%3D3&sdetail=rv%3A9mn5krn6xnk&sourceid=yw&cbr=Firefox&cbrver=135.0&c=WEB&cver=2.20250221.00.00&cplayer=UNIPLAYER&cos=X11&cplatform=DESKTOP&vps=1402.215:S&bwe=1402.215:21716096&cmt=1402.215:730.019&bh=1402.215:2.536&qclc=ChBOY1RRNHRmRUVlak9ZUkVrEEo")
			.headers(headers_1)
			.body(RawFileBody("com/gatling/tests/recordedsimulation/0001_request.txt")))
		.pause(6)
		.exec(http("request_2")
			.get("/web/index.php/auth/login")
			.headers(headers_2))
		.pause(1)
		.exec(http("request_3")
			.get("/web/dist/favicon.ico?v=1721393199309")
			.headers(headers_3)
			.resources(http("request_4")
			.get("/web/dist/js/chunk-vendors.js?v=1721393199309")
			.headers(headers_4),
            http("request_5")
			.get("/web/index.php/core/i18n/messages")
			.headers(headers_5),
            http("request_6")
			.get("/web/dist/img/blob.svg")
			.headers(headers_6),
            http("request_7")
			.get("/web/images/ohrm_branding.png?v=1721393199309")
			.headers(headers_7)))
		.pause(5)
		.exec(http("request_8")
			.post(uri5 + "?expire=1740333313&ei=oQy7Z6_bGYuv9fwPls-8kA0&ip=103.210.30.53&id=o-ADjC5_AKVMj6FC6JOlP0ZSfjEcWmcgYLk8wfH5ny5Nx6&source=youtube&requiressl=yes&xpc=EgVo2aDSNQ%3D%3D&met=1740311713%2C&mh=kN&mm=31%2C29&mn=sn-gxo0cgv5qc5oq-3o0e%2Csn-qxaeen7e&ms=au%2Crdu&mv=m&mvi=1&pl=24&rms=au%2Cau&pcm2=yes&initcwndbps=1151250&spc=RjZbSUcBEHs03YjCrpC2IapoBtxHzVOkii_XETSpg3UR4VqlNw&svpuc=1&ns=--b--oT73XfsjYhbpE1G6mMQ&sabr=1&rqh=1&mt=1740311347&fvip=3&keepalive=yes&fexp=51326932%2C51355912%2C51387516&c=WEB&n=RWr852RfDa3Jjg&sparams=expire%2Cei%2Cip%2Cid%2Csource%2Crequiressl%2Cxpc%2Cpcm2%2Cspc%2Csvpuc%2Cns%2Csabr%2Crqh&sig=AJfQdSswRgIhAINkxQJJ-C_YLdpZzUNXCQ52-hmpK2v9tnREBhVGaszRAiEA14h0b6NT3j0BNmQtSvmqnZvwkVgvnA6bS1TukbRV0Mc%3D&lsparams=met%2Cmh%2Cmm%2Cmn%2Cms%2Cmv%2Cmvi%2Cpl%2Crms%2Cinitcwndbps&lsig=AGluJ3MwRAIgXPa6siV7qG9dp8Tm4TEgjt_DOxLRsQghdC6vkMrXNdECICmCOqrHzagOvHz4RVXmnZpNrhnDzexsJsYkIUellV44&cpn=NcTQ4tfEEejOYREk&cver=2.20250221.00.00&rn=163&alr=yes")
			.headers(headers_8)
			.body(RawFileBody("com/gatling/tests/recordedsimulation/0008_request.bin"))
			.resources(http("request_9")
			.post(uri5 + "?expire=1740333313&ei=oQy7Z6_bGYuv9fwPls-8kA0&ip=103.210.30.53&id=o-ADjC5_AKVMj6FC6JOlP0ZSfjEcWmcgYLk8wfH5ny5Nx6&source=youtube&requiressl=yes&xpc=EgVo2aDSNQ%3D%3D&met=1740311713%2C&mh=kN&mm=31%2C29&mn=sn-gxo0cgv5qc5oq-3o0e%2Csn-qxaeen7e&ms=au%2Crdu&mv=m&mvi=1&pl=24&rms=au%2Cau&pcm2=yes&initcwndbps=1151250&spc=RjZbSUcBEHs03YjCrpC2IapoBtxHzVOkii_XETSpg3UR4VqlNw&svpuc=1&ns=--b--oT73XfsjYhbpE1G6mMQ&sabr=1&rqh=1&mt=1740311347&fvip=3&keepalive=yes&fexp=51326932%2C51355912%2C51387516&c=WEB&n=RWr852RfDa3Jjg&sparams=expire%2Cei%2Cip%2Cid%2Csource%2Crequiressl%2Cxpc%2Cpcm2%2Cspc%2Csvpuc%2Cns%2Csabr%2Crqh&sig=AJfQdSswRgIhAINkxQJJ-C_YLdpZzUNXCQ52-hmpK2v9tnREBhVGaszRAiEA14h0b6NT3j0BNmQtSvmqnZvwkVgvnA6bS1TukbRV0Mc%3D&lsparams=met%2Cmh%2Cmm%2Cmn%2Cms%2Cmv%2Cmvi%2Cpl%2Crms%2Cinitcwndbps&lsig=AGluJ3MwRAIgXPa6siV7qG9dp8Tm4TEgjt_DOxLRsQghdC6vkMrXNdECICmCOqrHzagOvHz4RVXmnZpNrhnDzexsJsYkIUellV44&cpn=NcTQ4tfEEejOYREk&cver=2.20250221.00.00&rn=164&alr=yes")
			.headers(headers_8)
			.body(RawFileBody("com/gatling/tests/recordedsimulation/0009_request.bin")),
            http("request_10")
			.post(uri5 + "?expire=1740333313&ei=oQy7Z6_bGYuv9fwPls-8kA0&ip=103.210.30.53&id=o-ADjC5_AKVMj6FC6JOlP0ZSfjEcWmcgYLk8wfH5ny5Nx6&source=youtube&requiressl=yes&xpc=EgVo2aDSNQ%3D%3D&met=1740311713%2C&mh=kN&mm=31%2C29&mn=sn-gxo0cgv5qc5oq-3o0e%2Csn-qxaeen7e&ms=au%2Crdu&mv=m&mvi=1&pl=24&rms=au%2Cau&pcm2=yes&initcwndbps=1151250&spc=RjZbSUcBEHs03YjCrpC2IapoBtxHzVOkii_XETSpg3UR4VqlNw&svpuc=1&ns=--b--oT73XfsjYhbpE1G6mMQ&sabr=1&rqh=1&mt=1740311347&fvip=3&keepalive=yes&fexp=51326932%2C51355912%2C51387516&c=WEB&n=RWr852RfDa3Jjg&sparams=expire%2Cei%2Cip%2Cid%2Csource%2Crequiressl%2Cxpc%2Cpcm2%2Cspc%2Csvpuc%2Cns%2Csabr%2Crqh&sig=AJfQdSswRgIhAINkxQJJ-C_YLdpZzUNXCQ52-hmpK2v9tnREBhVGaszRAiEA14h0b6NT3j0BNmQtSvmqnZvwkVgvnA6bS1TukbRV0Mc%3D&lsparams=met%2Cmh%2Cmm%2Cmn%2Cms%2Cmv%2Cmvi%2Cpl%2Crms%2Cinitcwndbps&lsig=AGluJ3MwRAIgXPa6siV7qG9dp8Tm4TEgjt_DOxLRsQghdC6vkMrXNdECICmCOqrHzagOvHz4RVXmnZpNrhnDzexsJsYkIUellV44&cpn=NcTQ4tfEEejOYREk&cver=2.20250221.00.00&rn=165&alr=yes")
			.headers(headers_8)
			.body(RawFileBody("com/gatling/tests/recordedsimulation/0010_request.bin")),
            http("request_11")
			.head(uri3 + "/generate_204")
			.headers(headers_11),
            http("request_12")
			.get(uri3 + "/api/stats/watchtime?ns=yt&el=detailpage&cpn=DSW2z9Nmi72ybpxC&ver=2&cmt=1.667&fmt=271&fs=0&rt=166.364&euri&lact=1370&cl=728418168&state=paused&volume=95&cbr=Firefox&cbrver=135.0&c=WEB&cver=2.20250221.00.00&cplayer=UNIPLAYER&cos=X11&cplatform=DESKTOP&final=1&hl=en_US&cr=IN&len=8124.641&feature=g-high-rec&afmt=251&idpj=-7&ldpj=-29&rti=14&st=1.667&et=1.667&muted=0&docid=m6TU2gykl6g&ei=kg-7Z_33NKaV4t4Pypj0oQo&plid=AAYuzhJi_BnX8igq&referrer=https%3A%2F%2Fwww.youtube.com%2F&sdetail=p%3A%2F&sourceid=y&of=cnSw_q5u7MOGO9NrpC_8pw&vm=CAMQARgBOjJBSHFpSlRJM25ySHpsTUFGamF3Q3NOX1g2a3NiOTI3TWN0N3RtU0NJd0xJQXNwX2t5UWJSQUZVQTZSVElhTjI0NkwwNTg1a1BxbFBzQld1ZUlncmxPNUFsN2pvMU5NZ2dTbFNSUFpBLUZhZURIWWVBVmd2dzd2ZHljTUp0YmtJMmdnRDZNUXgBuAEB")
			.headers(headers_12),
            http("request_13")
			.post(uri5 + "?expire=1740333313&ei=oQy7Z6_bGYuv9fwPls-8kA0&ip=103.210.30.53&id=o-ADjC5_AKVMj6FC6JOlP0ZSfjEcWmcgYLk8wfH5ny5Nx6&source=youtube&requiressl=yes&xpc=EgVo2aDSNQ%3D%3D&met=1740311713%2C&mh=kN&mm=31%2C29&mn=sn-gxo0cgv5qc5oq-3o0e%2Csn-qxaeen7e&ms=au%2Crdu&mv=m&mvi=1&pl=24&rms=au%2Cau&pcm2=yes&initcwndbps=1151250&spc=RjZbSUcBEHs03YjCrpC2IapoBtxHzVOkii_XETSpg3UR4VqlNw&svpuc=1&ns=--b--oT73XfsjYhbpE1G6mMQ&sabr=1&rqh=1&mt=1740311347&fvip=3&keepalive=yes&fexp=51326932%2C51355912%2C51387516&c=WEB&n=RWr852RfDa3Jjg&sparams=expire%2Cei%2Cip%2Cid%2Csource%2Crequiressl%2Cxpc%2Cpcm2%2Cspc%2Csvpuc%2Cns%2Csabr%2Crqh&sig=AJfQdSswRgIhAINkxQJJ-C_YLdpZzUNXCQ52-hmpK2v9tnREBhVGaszRAiEA14h0b6NT3j0BNmQtSvmqnZvwkVgvnA6bS1TukbRV0Mc%3D&lsparams=met%2Cmh%2Cmm%2Cmn%2Cms%2Cmv%2Cmvi%2Cpl%2Crms%2Cinitcwndbps&lsig=AGluJ3MwRAIgXPa6siV7qG9dp8Tm4TEgjt_DOxLRsQghdC6vkMrXNdECICmCOqrHzagOvHz4RVXmnZpNrhnDzexsJsYkIUellV44&cpn=NcTQ4tfEEejOYREk&cver=2.20250221.00.00&rn=166&alr=yes")
			.headers(headers_8)
			.body(RawFileBody("com/gatling/tests/recordedsimulation/0013_request.bin")),
            http("request_14")
			.post(uri3 + "/youtubei/v1/log_event?alt=json")
			.headers(headers_14)
			.body(RawFileBody("com/gatling/tests/recordedsimulation/0014_request.json")),
            http("request_15")
			.get(uri3 + "/api/stats/watchtime?ns=yt&el=detailpage&cpn=NcTQ4tfEEejOYREk&ver=2&cmt=730.019&fmt=308&fs=0&rt=994.001&euri&lact=39810&cl=728418168&state=playing&volume=95&cbr=Firefox&cbrver=135.0&c=WEB&cver=2.20250221.00.00&cplayer=UNIPLAYER&cos=X11&cplatform=DESKTOP&hl=en_US&cr=IN&len=1253.681&feature=BFa&afmt=251&idpj=-9&ldpj=-5&rti=994&st=730.019&et=730.019&rate=1.5&muted=0&docid=9F5ll-qS76I&ei=oQy7Z6_bGYuv9fwPls-8kA0&plid=AAYuzeV6f0e8CyVQ&referrer=https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3D9mn5krn6xnk%26list%3DPLhW3qG5bs-L-YQKiESvWmzIlS-dMo1b4D%26index%3D3&sdetail=rv%3A9mn5krn6xnk&sourceid=yw&list=PLhW3qG5bs-L-YQKiESvWmzIlS-dMo1b4D&of=eCyfaqozRid9e65FSHX6uw&vm=CAEQARgEOjJBSHFpSlRLMUdZYUppWHVGcWFuQkJZMEJBdHNuaExPUTh0ZlI1YXZhbFV0MkVhU3hOQWJPQUZVQTZSVFJ5dVVRaDgxSEhJMEl1M2sySzZncER5R2M3QVBFa0NzdzRmdnJHTDJkTTkzLWFyQWhNX1c1eVhHNnEwMGRVV0p1MUxfTVJGaw")
			.headers(headers_15),
            http("request_16")
			.post(uri3 + "/youtubei/v1/log_event?alt=json")
			.headers(headers_16)
			.body(RawFileBody("com/gatling/tests/recordedsimulation/0016_request.json")),
            http("request_17")
			.post(uri3 + "/api/stats/qoe?fmt=308&afmt=251&cpn=NcTQ4tfEEejOYREk&el=detailpage&ns=yt&fexp=v1%2C23986023%2C18621%2C49740%2C384977%2C60173%2C67153%2C133212%2C14625955%2C11684381%2C53408%2C9105%2C18310%2C4420%2C2821%2C59112%2C19100%2C8479%2C19339%2C18644%2C13046%2C1823%2C18242%2C28968%2C12968%2C2156%2C65%2C10501%2C3025%2C391%2C2590%2C10184%2C13730%2C9251%2C3480%2C2024%2C495%2C6731%2C2819%2C961%2C5335%2C11411%2C207%2C1373%2C1817%2C3063%2C238%2C3619%2C5196%2C1204%2C107%2C22%2C3473%2C1320%2C1%2C1015%2C1684%2C600%2C902%2C572%2C4758%2C712&cl=728418168&seq=75&docid=9F5ll-qS76I&ei=oQy7Z6_bGYuv9fwPls-8kA0&event=streamingstats&feature=BFa&plid=AAYuzeV6f0e8CyVQ&referrer=https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3D9mn5krn6xnk%26list%3DPLhW3qG5bs-L-YQKiESvWmzIlS-dMo1b4D%26index%3D3&sdetail=rv%3A9mn5krn6xnk&sourceid=yw&cbr=Firefox&cbrver=135.0&c=WEB&cver=2.20250221.00.00&cplayer=UNIPLAYER&cos=X11&cplatform=DESKTOP&bwe=1420.391:21716096,1420.392:21716096,1420.394:21716096,1422.348:5960946&bh=1420.391:2.536,1420.392:2.536,1420.394:2.536,1422.348:78.836&vps=1421.166:B,1421.427:PL,1422.348:PL&bwm=1422.348:6718783:1.567&qclc=ChBOY1RRNHRmRUVlak9ZUkVrEEs")
			.headers(headers_1)
			.body(RawFileBody("com/gatling/tests/recordedsimulation/0017_request.txt")),
            http("request_18")
			.post(uri3 + "/youtubei/v1/log_event?alt=json")
			.headers(headers_18)
			.body(RawFileBody("com/gatling/tests/recordedsimulation/0018_request.json")),
            http("request_19")
			.post(uri3 + "/youtubei/v1/log_event?alt=json")
			.headers(headers_19)
			.body(RawFileBody("com/gatling/tests/recordedsimulation/0019_request.json")),
            http("request_20")
			.head(uri3 + "/generate_204")
			.headers(headers_11),
            http("request_21")
			.get(uri6 + "?zx=7gjmn3hxc4hv")
			.headers(headers_0),
            http("request_22")
			.post(uri5 + "?expire=1740333313&ei=oQy7Z6_bGYuv9fwPls-8kA0&ip=103.210.30.53&id=o-ADjC5_AKVMj6FC6JOlP0ZSfjEcWmcgYLk8wfH5ny5Nx6&source=youtube&requiressl=yes&xpc=EgVo2aDSNQ%3D%3D&met=1740311713%2C&mh=kN&mm=31%2C29&mn=sn-gxo0cgv5qc5oq-3o0e%2Csn-qxaeen7e&ms=au%2Crdu&mv=m&mvi=1&pl=24&rms=au%2Cau&pcm2=yes&initcwndbps=1151250&spc=RjZbSUcBEHs03YjCrpC2IapoBtxHzVOkii_XETSpg3UR4VqlNw&svpuc=1&ns=--b--oT73XfsjYhbpE1G6mMQ&sabr=1&rqh=1&mt=1740311347&fvip=3&keepalive=yes&fexp=51326932%2C51355912%2C51387516&c=WEB&n=RWr852RfDa3Jjg&sparams=expire%2Cei%2Cip%2Cid%2Csource%2Crequiressl%2Cxpc%2Cpcm2%2Cspc%2Csvpuc%2Cns%2Csabr%2Crqh&sig=AJfQdSswRgIhAINkxQJJ-C_YLdpZzUNXCQ52-hmpK2v9tnREBhVGaszRAiEA14h0b6NT3j0BNmQtSvmqnZvwkVgvnA6bS1TukbRV0Mc%3D&lsparams=met%2Cmh%2Cmm%2Cmn%2Cms%2Cmv%2Cmvi%2Cpl%2Crms%2Cinitcwndbps&lsig=AGluJ3MwRAIgXPa6siV7qG9dp8Tm4TEgjt_DOxLRsQghdC6vkMrXNdECICmCOqrHzagOvHz4RVXmnZpNrhnDzexsJsYkIUellV44&cpn=NcTQ4tfEEejOYREk&cver=2.20250221.00.00&rn=167&alr=yes")
			.headers(headers_8)
			.body(RawFileBody("com/gatling/tests/recordedsimulation/0022_request.bin"))))
		.pause(1)
		.exec(http("request_23")
			.post(uri2 + "?action=sendHeartbeat")
			.headers(headers_23)
			.body(RawFileBody("com/gatling/tests/recordedsimulation/0023_request.txt")))
		.pause(1)
		.exec(http("request_24")
			.options(uri4 + "/v1/chooseServer?key=AIzaSyCIMH2ks6VPAfRC2lqU_Snz1Lo76XGdnlc")
			.headers(headers_24)
			.resources(http("request_25")
			.post(uri4 + "/v1/chooseServer?key=AIzaSyCIMH2ks6VPAfRC2lqU_Snz1Lo76XGdnlc")
			.headers(headers_25)
			.body(RawFileBody("com/gatling/tests/recordedsimulation/0025_request.dat"))))
		.pause(1)
		.exec(http("request_26")
			.options(uri4 + "/multi-watch/channel?VER=8&gsessionid=JVMu19PCF1BQUzoW7wgeuYSwxmZomebW3nk90Fo2Bz4&key=AIzaSyCIMH2ks6VPAfRC2lqU_Snz1Lo76XGdnlc&RID=13102&CVER=22&zx=md14ejjmz2k4&t=1")
			.headers(headers_26)
			.resources(http("request_27")
			.post(uri4 + "/multi-watch/channel?VER=8&gsessionid=JVMu19PCF1BQUzoW7wgeuYSwxmZomebW3nk90Fo2Bz4&key=AIzaSyCIMH2ks6VPAfRC2lqU_Snz1Lo76XGdnlc&RID=13102&CVER=22&zx=md14ejjmz2k4&t=1")
			.headers(headers_27)
			.formParam("count", "1")
			.formParam("ofs", "0")
			.formParam("req0___data__", """[[["2",["1740312659184559",null,null,[7,5],null,[["gmail"],[1],[[["YW1hbnZpcmF0amhhMDAxQGdtYWlsLmNvbQ"]]]],null,1,2],null,3]]]"""),
            http("request_28")
			.options(uri4 + "/multi-watch/channel?VER=8&gsessionid=JVMu19PCF1BQUzoW7wgeuYSwxmZomebW3nk90Fo2Bz4&key=AIzaSyCIMH2ks6VPAfRC2lqU_Snz1Lo76XGdnlc&RID=rpc&SID=gkWgSRVLcFBv1dMSzbdPww&AID=0&CI=0&TYPE=xmlhttp&zx=sbs2z6kbcinv&t=1")
			.headers(headers_28)))
		.pause(4)
		.exec(http("request_29")
			.post(uri3 + "/api/stats/qoe?fmt=308&afmt=251&cpn=NcTQ4tfEEejOYREk&el=detailpage&ns=yt&fexp=v1%2C23986023%2C18621%2C49740%2C384977%2C60173%2C67153%2C133212%2C14625955%2C11684381%2C53408%2C9105%2C18310%2C4420%2C2821%2C59112%2C19100%2C8479%2C19339%2C18644%2C13046%2C1823%2C18242%2C28968%2C12968%2C2156%2C65%2C10501%2C3025%2C391%2C2590%2C10184%2C13730%2C9251%2C3480%2C2024%2C495%2C6731%2C2819%2C961%2C5335%2C11411%2C207%2C1373%2C1817%2C3063%2C238%2C3619%2C5196%2C1204%2C107%2C22%2C3473%2C1320%2C1%2C1015%2C1684%2C600%2C902%2C572%2C4758%2C712&cl=728418168&seq=76&docid=9F5ll-qS76I&ei=oQy7Z6_bGYuv9fwPls-8kA0&event=streamingstats&feature=BFa&plid=AAYuzeV6f0e8CyVQ&referrer=https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3D9mn5krn6xnk%26list%3DPLhW3qG5bs-L-YQKiESvWmzIlS-dMo1b4D%26index%3D3&sdetail=rv%3A9mn5krn6xnk&sourceid=yw&cbr=Firefox&cbrver=135.0&c=WEB&cver=2.20250221.00.00&cplayer=UNIPLAYER&cos=X11&cplatform=DESKTOP&bwm=1427.934:1805344:0.176&bwe=1427.934:6959191,1427.940:6959191,1430.014:6959191,1430.016:6959191,1435.112:6959191&vis=1427.934:0,1430.014:3&bh=1427.934:76.095,1427.940:76.095,1430.014:79.257,1430.016:79.257,1435.112:79.257&vps=1428.950:PA&qclc=ChBOY1RRNHRmRUVlak9ZUkVrEEw")
			.headers(headers_1)
			.body(RawFileBody("com/gatling/tests/recordedsimulation/0029_request.txt")))
		.pause(9)
		.exec(http("request_30")
			.post("/web/index.php/auth/validate")
			.headers(headers_30)
			.formParam("_token", "3d00db715f74c4b9.T_JTYf-gSBC0snO5NWjuKW2gKaJvoaxi2_zaXhOpzZg.JrsDVqDIPFjwhT7ABRGbXz3RRcNW4pohtMXoAUHPiKF6pjI-jcIHXIfiNg")
			.formParam("username", "Admin")
			.formParam("password", "admin123")
			.resources(http("request_31")
			.get("/web/index.php/core/i18n/messages")
			.headers(headers_31),
            http("request_32")
			.get("/web/index.php/pim/viewPhoto/empNumber/7")
			.headers(headers_7),
            http("request_33")
			.get("/web/images/orange.png?v=1721393199309")
			.headers(headers_7),
            http("request_34")
			.get("/web/images/orangehrm-logo.png?v=1721393199309")
			.headers(headers_7),
            http("request_35")
			.get("/web/index.php/api/v2/dashboard/employees/action-summary")
			.headers(headers_35),
            http("request_36")
			.get("/web/index.php/api/v2/dashboard/employees/time-at-work?timezoneOffset=5.5&currentDate=2025-02-23&currentTime=17:49")
			.headers(headers_35),
            http("request_37")
			.get("/web/index.php/api/v2/dashboard/shortcuts")
			.headers(headers_35),
            http("request_38")
			.get("/web/index.php/api/v2/buzz/feed?limit=5&offset=0&sortOrder=DESC&sortField=share.createdAtUtc")
			.headers(headers_38),
            http("request_39")
			.get("/web/index.php/api/v2/dashboard/employees/leaves?date=2025-02-23")
			.headers(headers_35),
            http("request_40")
			.get("/web/index.php/api/v2/dashboard/employees/subunit")
			.headers(headers_35),
            http("request_41")
			.get("/web/index.php/api/v2/dashboard/employees/locations")
			.headers(headers_35),
            http("request_42")
			.post("/web/index.php/events/push")
			.headers(headers_42),
            http("request_43")
			.get("/web/index.php/pim/viewPhoto/empNumber/11")
			.headers(headers_7),
            http("request_44")
			.get("/web/index.php/pim/viewPhoto/empNumber/9")
			.headers(headers_7),
            http("request_45")
			.get("/web/index.php/buzz/photo/9")
			.headers(headers_7),
            http("request_46")
			.get("/web/index.php/pim/viewPhoto/empNumber/22")
			.headers(headers_7)))
		.pause(4)
		.exec(http("request_47")
			.get(uri6 + "?zx=y2vh35m938wq")
			.headers(headers_0))
		.pause(8)
		.exec(http("request_48")
			.get(uri3 + "/api/stats/watchtime?ns=yt&el=detailpage&cpn=NcTQ4tfEEejOYREk&ver=2&cmt=741.62&fmt=308&fs=0&rt=1462.338&euri&lact=33110&cl=728418168&state=paused&volume=95%2C95&cbr=Firefox&cbrver=135.0&c=WEB&cver=2.20250221.00.00&cplayer=UNIPLAYER&cos=X11&cplatform=DESKTOP&hl=en_US&cr=IN&len=1253.681&rtn=1502&feature=BFa&afmt=251&idpj=-9&ldpj=-5&rti=1462&st=730.019%2C739.631&et=739.631%2C741.62&rate=1.5%2C1.5&muted=0%2C0&vis=3%2C0&docid=9F5ll-qS76I&ei=oQy7Z6_bGYuv9fwPls-8kA0&plid=AAYuzeV6f0e8CyVQ&referrer=https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3D9mn5krn6xnk%26list%3DPLhW3qG5bs-L-YQKiESvWmzIlS-dMo1b4D%26index%3D3&sdetail=rv%3A9mn5krn6xnk&sourceid=yw&list=PLhW3qG5bs-L-YQKiESvWmzIlS-dMo1b4D&of=eCyfaqozRid9e65FSHX6uw&vm=CAEQARgEOjJBSHFpSlRLMUdZYUppWHVGcWFuQkJZMEJBdHNuaExPUTh0ZlI1YXZhbFV0MkVhU3hOQWJPQUZVQTZSVFJ5dVVRaDgxSEhJMEl1M2sySzZncER5R2M3QVBFa0NzdzRmdnJHTDJkTTkzLWFyQWhNX1c1eVhHNnEwMGRVV0p1MUxfTVJGaw")
			.headers(headers_48)
			.resources(http("request_49")
			.get("/web/index.php/help/help?label=dashboard_index")
			.headers(headers_49)))
		.pause(10)
		.exec(http("request_50")
			.get("/web/index.php/auth/logout")
			.headers(headers_49)
			.resources(http("request_51")
			.get("/web/index.php/core/i18n/messages")
			.headers(headers_31),
            http("request_52")
			.options(uri4 + "/multi-watch/channel?VER=8&gsessionid=JVMu19PCF1BQUzoW7wgeuYSwxmZomebW3nk90Fo2Bz4&key=AIzaSyCIMH2ks6VPAfRC2lqU_Snz1Lo76XGdnlc&RID=rpc&SID=gkWgSRVLcFBv1dMSzbdPww&AID=0&CI=0&TYPE=xmlhttp&zx=4murgfpji3ta&t=2")
			.headers(headers_28)))
		.pause(8)
		.exec(http("request_53")
			.post(uri2 + "?action=sendHeartbeat")
			.headers(headers_23)
			.body(RawFileBody("com/gatling/tests/recordedsimulation/0053_request.txt")))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}