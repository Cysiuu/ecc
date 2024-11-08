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

        <v-row class="mt-3 pa-0 d-flex justify-center align-center">
          <v-col
            cols="12"
            sm="7"
            md="7"
            lg="7"
            xl="7"
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
            sm="5"
            md="5"
            lg="5"
            xl="5"
            class="d-flex align-center"
          >
            <v-btn
              color="secondary"
              size="large"
              class="font-weight-600 "
              style="width: 100%"
            >
              Randomize Pattern
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
</style>
