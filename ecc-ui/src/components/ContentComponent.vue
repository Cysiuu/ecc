<script setup>
</script>

<template>
  <v-container class="fluid align-center justify-center fill-height">
      <v-form>

        <h2 class="text-h2 text-center mb-8">Extreme Caesar Cipher</h2>

        <v-row>
          <v-col
            cols="12"
            sm="8"
            md="8"
            lg="8"
            xl="8">
            <v-text-field
              clearable
              label="Pattern"
              variant="solo"
            ></v-text-field>
          </v-col>
          <v-col
            cols="12"
            sm="4"
            md="4"
            lg="4"
            xl="4"
            class="d-flex align-center justify-center"
          >
            <v-btn
              color="secondary"
            >Randomize Pattern</v-btn>
          </v-col>
        </v-row>

        <v-row>
          <v-col
            cols="12"
            sm="12"
            md="12"
            lg="12"
            xl="12"
          >
            <v-card>
              <v-card-title>Text to encode / decode</v-card-title>
              <v-card-text>
                <v-textarea
                  clearable
                  variant="outlined"
                  no-resize
                ></v-textarea>
              </v-card-text>
            </v-card>
          </v-col>

          <v-col
          cols="12"
          sm="12"
          md="12"
          lg="12"
          xl="12"
          >
            <v-card>
              <v-card-title>Output</v-card-title>
              <v-card-text>
                <v-textarea
                  readonly
                  variant="outlined"
                  no-resize
                ></v-textarea>
              </v-card-text>
            </v-card>
          </v-col>
        </v-row>

        <v-col class="text-center mb-4 mt-4">
          <v-btn class="v-btn--size-x-large">GO</v-btn>
        </v-col>

      </v-form>

    <v-bottom-navigation app class="d-flex align-center">
      <v-icon
        icon="mdi-github"
        size="30"
        class="ml-auto mr-4"
        @click="goToGitHub"
      ></v-icon>
    </v-bottom-navigation>

  </v-container>
</template>

<style scoped>
.fill-height{
  min-height: 100vh;
}
</style>

<script>
export default {
  methods: {
    goToGitHub() {
      window.open('https://github.com/Cysiuu/ecc', '_blank');
    }
  }
}
</script>

