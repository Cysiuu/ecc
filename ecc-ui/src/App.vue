<script setup>
// import { RouterLink, RouterView } from 'vue-router';
</script>

<template>
  <div id="app">
    <v-app>
      <v-main>
        <main>
          <content-component/>
        </main>
      </v-main>
    </v-app>
  </div>
</template>

<style>
</style>

<script>
import ContentComponent from '@/components/ContentComponent.vue'

export default {
  name: 'App',
  components: {
   ContentComponent
  }
}
</script>
