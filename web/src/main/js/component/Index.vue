<template>
  <div id="app" class="section">
    <h1 class="title">Tech Verf</h1>
    <div class="content">
      <ul>
        <li v-for="menuItem in menuItems" :key="menuItem">
          <a :href="menuItem + '/index.html'">{{ menuItem }}</a>
        </li>
      </ul>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      menuItems: [
        'capNw7'
      ]
    }
  }
}
</script>

<style scoped>
</style>