package org.jboss.as.clustering.infinispan.cs.factory;

import java.util.concurrent.Executor;

import org.infinispan.commons.configuration.ConfiguredBy;
import org.infinispan.filter.KeyFilter;
import org.infinispan.marshall.core.MarshalledEntry;
import org.infinispan.persistence.spi.AdvancedCacheLoader;
import org.infinispan.persistence.spi.InitializationContext;

@ConfiguredBy(CustomStoreConfigurationWithBuilder.class)
public class CustomStoreWithConfigurationAndBuilder implements AdvancedCacheLoader<Object,Object> {

   @Override
   public void process(KeyFilter<? super Object> filter, CacheLoaderTask<Object, Object> task, Executor executor, boolean fetchValue, boolean fetchMetadata) {
   }

   @Override
   public int size() {
      return 0;
   }

   @Override
   public void init(InitializationContext ctx) {
   }

   @Override
   public MarshalledEntry<Object, Object> load(Object key) {
      return null;
   }

   @Override
   public boolean contains(Object key) {
      return false;
   }

   @Override
   public void start() {
   }

   @Override
   public void stop() {
   }
}
