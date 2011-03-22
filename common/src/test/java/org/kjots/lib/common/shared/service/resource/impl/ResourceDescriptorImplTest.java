/* 
 * Copyright © 2011 Karl J. Ots.  All Rights Reserved.
 */
package org.kjots.lib.common.shared.service.resource.impl;

import org.junit.Test;

import org.kjots.lib.common.CommonTestBase;
import org.kjots.lib.common.shared.service.resource.ResourceDescriptor;

/**
 * Resource Descriptor Implementation Base Test.
 * <p>
 * Created: 19th March 2011.
 *
 * @author <a href="mailto:kjots@kjots.org">Karl J. Ots &lt;kjots@kjots.org&gt;</a>
 * @since 99-SNAPSHOT
 */
public class ResourceDescriptorImplTest extends CommonTestBase {
  /**
   * Test the the {@link ResourceDescriptorImpl#ResourceDescriptorImpl(String)}
   * constructor.
   * <p>
   * This test asserts that the {@link ResourceDescriptorImpl#ResourceDescriptorImpl(String)}
   * constructor throws an {@link IllegalArgumentException} when provided with
   * a <code>null</code> resource type.
   */
  @Test(expected = IllegalArgumentException.class)
  public void testOneArgConstructorWithNullResourceUriScheme() {
    new ResourceDescriptorImpl(null);
  }
  
  /**
   * Test the the {@link ResourceDescriptorImpl#ResourceDescriptorImpl(String)}
   * constructor.
   * <p>
   * This test asserts that the {@link ResourceDescriptorImpl#ResourceDescriptorImpl(String)}
   * constructor throws an {@link IllegalArgumentException} when provided with
   * an empty resource type.
   */
  @Test(expected = IllegalArgumentException.class)
  public void testOneArgConstructorWithEmptyResourceUriScheme() {
    new ResourceDescriptorImpl("");
  }
  
  /**
   * Test the the {@link ResourceDescriptorImpl#ResourceDescriptorImpl(String, ResourceDescriptor)}
   * constructor.
   * <p>
   * This test asserts that the {@link ResourceDescriptorImpl#ResourceDescriptorImpl(String, ResourceDescriptor)}
   * constructor throws an {@link IllegalArgumentException} when provided with
   * a <code>null</code> resource type.
   */
  @Test(expected = IllegalArgumentException.class)
  public void testTwoArgConstructorWithNullResourceUriScheme() {
    new ResourceDescriptorImpl(null, null);
  }
  
  /**
   * Test the the {@link ResourceDescriptorImpl#ResourceDescriptorImpl(String, ResourceDescriptor)}
   * constructor.
   * <p>
   * This test asserts that the {@link ResourceDescriptorImpl#ResourceDescriptorImpl(String, ResourceDescriptor)}
   * constructor throws an {@link IllegalArgumentException} when provided with
   * an empty resource type.
   */
  @Test(expected = IllegalArgumentException.class)
  public void testTwoArgConstructorWithEmptyResourceUriScheme() {
    new ResourceDescriptorImpl("", null);
  }
}