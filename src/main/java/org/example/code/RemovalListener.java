package org.example.code;

@FunctionalInterface
interface RemovalListener<S,K,V,N>{
      void onRemoval(S s, K k, V v, N n) ;
}
