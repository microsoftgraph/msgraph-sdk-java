package com.microsoft.graph.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.microsoft.graph.logger.DefaultLogger;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.models.extensions.UserActivity;
import com.microsoft.graph.serializer.DefaultSerializer;

/**
 * Tests for sending custom requests using the SDK
 */
@Ignore
public class CustomRequestTests {
	private TestBase testBase;

	@Before
	public void setUp() {
		testBase = new TestBase();
	}

	/**
	 * Test GET with a custom request for both serialized and JSON content
	 */
	@Test
	public void testCustomGet() {
		User meOriginal = testBase.graphClient.me().buildRequest().get();

		User meGraphService = testBase.graphClient
				.customRequest("/me", User.class)
				.buildRequest()
				.get();

		JsonObject meJson = testBase.graphClient
				.customRequest("/me")
				.buildRequest()
				.get();

		assertEquals(meGraphService.displayName, meOriginal.displayName);
		assertEquals(meJson.get("displayName").getAsString(), meOriginal.displayName);
	}
	
	/**
	 * Test PUT with a custom request for both serialized and JSON content
	 */
	@Test
	public void testCustomPut() {
		JsonParser parser =  new JsonParser();
		DefaultSerializer serializer = new DefaultSerializer(new DefaultLogger());
		String str = "{ \"appActivityId\": \"/article?12345\", \"activitySourceHost\": \"https://www.contoso.com\", \"userTimezone\": \"Africa/Casablanca\","
				+ " \"appDisplayName\": \"Contoso, Ltd.\", \"activationUrl\": \"https://www.contoso.com/article?id=12345\", \"contentUrl\": \"https://www.contoso.com/article?id=12345\", "
				+ "\"fallbackUrl\": \"https://www.contoso.com/article?id=12345\", \"contentInfo\": { \"@context\": \"https://schema.org\", \"@type\": \"Article\", \"author\": \"Jennifer Booth\", "
				+ "\"name\": \"How to Tie a Reef Knot\" }, \"visualElements\": { \"attribution\": { \"iconUrl\": \"https://www.contoso.com/icon\", \"alternateText\": \"Contoso, Ltd.\", "
				+ "\"addImageQuery\": false }, \"description\": \"How to Tie a Reef Knot. A step-by-step visual guide to the art of nautical knot-tying.\", \"backgroundColor\": \"#ff0000\","
				+ " \"displayText\": \"Contoso How-To: How to Tie a Reef Knot\", \"content\": { \"$schema\": \"https://adaptivecards.io/schemas/adaptive-card.json\", \"type\": \"AdaptiveCard\","
				+ " \"body\": [{ \"type\": \"TextBlock\", \"text\": \"Contoso MainPage\" }] } } }";
		
		JsonObject response = testBase.graphClient.
				customRequest("/me/activities/%2Farticle%3F12346").
				buildRequest().
				put(parser.parse(str).getAsJsonObject());
		
		UserActivity userActivity = serializer.deserializeObject(str, UserActivity.class); 
		UserActivity responseWithClass = testBase.graphClient.
				customRequest("/me/activities/2", UserActivity.class).
				buildRequest().
				put(userActivity);
		
		assertNotNull(response);
		assertNotNull(responseWithClass);
	}
}
