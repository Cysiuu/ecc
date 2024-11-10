<script setup>
</script>

<template>
  <div id="app">
    <v-app>
      <v-main class="dotted-background">
        <main>
          <content-component/>
          <bottom-bar-component/>
        </main>
      </v-main>
    </v-app>
  </div>
</template>

<style>
.dotted-background {
  min-height: 100vh;
  background-color: rgba(255, 255, 255, 0);
  background-image: url("data:image/svg+xml,%3Csvg xmlns='http://www.w3.org/2000/svg' width='20' height='20' viewBox='0 0 20 20'%3E%3Ccircle cx='1' cy='1' r='1' fill='%23cccccc' fill-opacity='0.5' /%3E%3C/svg%3E");
  background-repeat: repeat;
}

</style>

<script>
import ContentComponent from '@/components/Content.vue'
import BottomBarComponent from '@/components/BottomBar.vue'

export default {
  name: 'App',
  components: {
    ContentComponent,
    BottomBarComponent
  }
}
</script>
