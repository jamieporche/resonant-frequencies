<template>
	<header>
		<header-component />
	</header>
	<div class="router-view">
		<router-view />
	</div>
	<footer>
		<footer-component class="footer-component" />
	</footer>
</template>

<script>
import HeaderComponent from "./components/HeaderComponent.vue";
import FooterComponent from "./components/FooterComponent.vue";
export default {
	name: 'App',
	components: {
		HeaderComponent,
		FooterComponent
	},
};
</script>

<style>
body {
  background-image: url("./assets/resonant-frequencies-background.png");
  background-size: 100vw;
  margin: 0px;
  min-height: 100vh;
}

#app {
  display: flex;
  flex-direction: column;
  min-height: 100vh;
}

.router-view {
	flex: 1;
}

.footer-component {
	margin-top: auto;
}
</style>
