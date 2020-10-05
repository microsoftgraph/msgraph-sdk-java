package com.microsoft.graph.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.microsoft.graph.authentication.MockAuthenticationProvider;
import com.microsoft.graph.logger.DefaultLogger;
import com.microsoft.graph.logger.ILogger;

/**
 * Test cases for {@see DefaultClientConfig}
 */
public class DefaultClientConfigTests {

	private IClientConfig mClientConfig;
	
	@Before
	public void setUp() throws Exception {
        mClientConfig = new DefaultClientConfig();
	}

	@Test
	public void testDefaultClientConfig() {
        assertNotNull(mClientConfig);
        assertNotNull(mClientConfig.getLogger());
        assertNotNull(mClientConfig.getExecutors());
        assertNotNull(mClientConfig.getSerializer());
        assertNotNull(mClientConfig.getHttpProvider());
    }
	
    @Test
    public void testOverrideLoggerShouldNotThrow() {
        final ILogger logger = new DefaultLogger();
        DefaultClientConfig config = new DefaultClientConfig() {

            @Override
            public ILogger getLogger() {
                return logger;
            }
        };
        config.getExecutors();
        config.getHttpProvider();
        config.getSerializer();
        config.getLogger();
    }

}
