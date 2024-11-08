<template>
  <v-container class="fluid align-center justify-center fill-height">
    <v-form>
      <h2 class="text-h2 text-center mb-8 font-weight-bold">
        <span class="text-secondary">Extended</span> Caesar Cipher
      </h2>

      <v-row>
        <v-col cols="12">
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

        <v-row class="pa-2 d-flex justify-center align-center" style="margin: 0 auto;">
          <v-col
            cols="12"
            sm="8"
            md="8"
            lg="8"
            xl="8"
            class="d-flex align-center"
          >
            <v-text-field
              clearable
              label="Pattern"
              variant="solo"
              class="mt-5"
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
              class="font-weight-600 custom-button"
              rounded="lg"
              size="large"
              style="min-width: 120px"
            >
              Randomize <br /> Pattern
            </v-btn>
          </v-col>
        </v-row>


        <v-col cols="12" class="mt-3">
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
        <v-btn
          color="secondary"
          size="x-large"
          rounded="lg"
          class="font-weight-600"
        >
          GO
        </v-btn>
      </v-col>
    </v-form>
  </v-container>
</template>

<style scoped>
.fill-height {
  min-height: 100vh;
}

.font-weight-600 {
  font-weight: 600;
}

.custom-button {
  text-align: center;
  line-height: 1.2;
}
</style>
